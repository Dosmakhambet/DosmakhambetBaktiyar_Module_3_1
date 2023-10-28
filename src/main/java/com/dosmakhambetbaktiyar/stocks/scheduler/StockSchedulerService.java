package com.dosmakhambetbaktiyar.stocks.scheduler;

import com.dosmakhambetbaktiyar.stocks.client.ClientService;
import com.dosmakhambetbaktiyar.stocks.dto.QuoteDto;
import com.dosmakhambetbaktiyar.stocks.model.Company;
import com.dosmakhambetbaktiyar.stocks.repository.CompanyRepository;
import com.dosmakhambetbaktiyar.stocks.repository.QuoteRepository;
import com.dosmakhambetbaktiyar.stocks.service.CompanyService;
import com.dosmakhambetbaktiyar.stocks.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.*;
import java.util.stream.Collectors;

@Service
@EnableScheduling
public class StockSchedulerService {

    @Autowired
    private QuoteService quoteService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private ExecutorService executorService;
    @Autowired
    private ClientService clientService;

    public StockSchedulerService(QuoteService quoteService,CompanyService companyService, ExecutorService executorService, ClientService clientService) {
        this.quoteService = quoteService;
        this.companyService = companyService;
        this.executorService = executorService;
        this.clientService = clientService;
    }

    @Scheduled(fixedDelay = 60*60*1000, initialDelay = 5000)
    public void schedule(){

        List<Company> companies = updateCompanies();

        BlockingQueue<Company> blockingQueue = new LinkedBlockingQueue<>(companies);

        List<CompletableFuture<Optional<QuoteDto>>> futureList = blockingQueue.stream()
                .map(c -> CompletableFuture.supplyAsync(() -> Optional.ofNullable(clientService.getStocks(c.getSymbol())),executorService)).toList();

        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[futureList.size()]))
                .thenApply(c ->
                    futureList.stream().map(CompletableFuture::join)
                            .filter(Optional::isPresent)
                            .map(Optional::get)
                            .map(QuoteDto::asEntity)
                            .collect(Collectors.toList())
                ).thenAccept(quotes -> quotes.forEach(quoteService::insert));

        //коллекция объектов развернуть в коллекцию quote
        // cron заполнение данных
        // log и тесты
    }

    private List<Company> updateCompanies(){
        List<Company> companies = clientService.getCompanies().stream().filter(Company::getIsEnabled).limit(200).toList();
        List<String> symbols = companyService.getCompaniesSymbol();

        List<Company> filterList = companies.stream().filter(company -> !symbols.contains(company.getSymbol()))
                .toList();

        filterList.forEach(companyService::insert);

        return companies;
    }
}
