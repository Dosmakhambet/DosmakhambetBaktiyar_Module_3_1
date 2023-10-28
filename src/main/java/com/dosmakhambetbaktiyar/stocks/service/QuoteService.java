package com.dosmakhambetbaktiyar.stocks.service;

import com.dosmakhambetbaktiyar.stocks.model.Quote;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface QuoteService {

    @Transactional
    Quote save(Quote quote);

    @Transactional
    Quote update(Quote quote);

    @Transactional
    List<Quote> saveAll(List<Quote> quotes);

    Optional<Quote> findById(String id);

    List<Quote> findAll();

    Quote insert(Quote quote);
}
