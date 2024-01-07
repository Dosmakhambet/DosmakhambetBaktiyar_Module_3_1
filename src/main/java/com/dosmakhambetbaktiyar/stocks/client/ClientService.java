package com.dosmakhambetbaktiyar.stocks.client;

import com.dosmakhambetbaktiyar.stocks.dto.QuoteDto;
import com.dosmakhambetbaktiyar.stocks.model.Company;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class ClientService {
    @Value("${iex.url}")
    private String baseUrl;
    @Value("${iex.api_secret}")
    private String token;
    @Autowired
    private RestTemplate restTemplate;


    public ClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Company> getCompanies(){
        String url = baseUrl + "stable/ref-data/symbols?token="+token;

        ResponseEntity<Company[]> response = restTemplate.getForEntity(url, Company[].class);

        return Arrays.stream(response.getBody()).toList();
    }

    public QuoteDto getStocks(String symbol){
        String url = baseUrl + "stable/stock/"+symbol+"/quote?token="+token;
        QuoteDto quoteDto = null;
        try{
            quoteDto = restTemplate.getForEntity(url, QuoteDto.class).getBody();
        }catch (Exception e){
            log.info(e.getMessage());
        }

        return quoteDto;
    }
}
