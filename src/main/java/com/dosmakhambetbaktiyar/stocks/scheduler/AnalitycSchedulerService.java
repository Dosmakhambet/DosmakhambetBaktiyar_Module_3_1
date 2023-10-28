package com.dosmakhambetbaktiyar.stocks.scheduler;

import com.dosmakhambetbaktiyar.stocks.model.Quote;
import com.dosmakhambetbaktiyar.stocks.repository.QuoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableScheduling
public class AnalitycSchedulerService {
    @Autowired
    private QuoteRepository repository;
    private Logger logger = LoggerFactory.getLogger(AnalitycSchedulerService.class);

    @Scheduled(fixedDelay = 5000, initialDelay = 1)
    public void schedule(){
        List<Quote> quotesVolume = repository.getTop5ByOrderByPreviousVolumeDesc();

        List<Quote> quotesPrice = repository.getTop5ByOrderByChangeDesc();

        logger.info("The top 5 highest value stocks: ");
        quotesVolume.stream().forEachOrdered(quote -> logger.info(quote.getCompanyName() + " = " + quote.getPreviousVolume()));

        logger.info("The most recent 5 companies that have the greatest change percent in stock value: ");

        quotesPrice.stream().forEachOrdered(quote -> logger.info(quote.getCompanyName() + " = " + quote.getChange()));

    }
}
