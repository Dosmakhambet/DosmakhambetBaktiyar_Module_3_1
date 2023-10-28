package com.dosmakhambetbaktiyar.stocks.service.Impl;

import com.dosmakhambetbaktiyar.stocks.model.Quote;
import com.dosmakhambetbaktiyar.stocks.repository.QuoteRepository;
import com.dosmakhambetbaktiyar.stocks.service.QuoteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class QuoteServiceImpl implements QuoteService {

    private final QuoteRepository repository;

    public QuoteServiceImpl(QuoteRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Quote save(Quote quote) {
        return repository.save(quote);
    }

    @Override
    @Transactional
    public Quote update(Quote quote) {
        return repository.save(quote);
    }

    @Override
    public List<Quote> saveAll(List<Quote> quotes) {
        return repository.saveAll(quotes);
    }

    @Override
    public Optional<Quote> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public List<Quote> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Quote insert(Quote quote){ return repository.insert(quote); }
}
