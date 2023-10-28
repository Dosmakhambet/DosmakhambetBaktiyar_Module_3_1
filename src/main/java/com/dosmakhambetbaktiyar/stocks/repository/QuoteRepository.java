package com.dosmakhambetbaktiyar.stocks.repository;

import com.dosmakhambetbaktiyar.stocks.model.Quote;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface QuoteRepository extends MongoRepository<Quote, String> {
    List<Quote> getTop5ByOrderByPreviousVolumeDesc();

    List<Quote> getTop5ByOrderByChangeDesc();
}
