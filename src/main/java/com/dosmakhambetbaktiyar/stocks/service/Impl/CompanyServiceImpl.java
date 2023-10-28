package com.dosmakhambetbaktiyar.stocks.service.Impl;

import com.dosmakhambetbaktiyar.stocks.model.Company;
import com.dosmakhambetbaktiyar.stocks.model.Quote;
import com.dosmakhambetbaktiyar.stocks.repository.CompanyRepository;
import com.dosmakhambetbaktiyar.stocks.repository.QuoteRepository;
import com.dosmakhambetbaktiyar.stocks.service.CompanyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository repository;

    public CompanyServiceImpl(CompanyRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Company save(Company company) {
        return repository.save(company);
    }

    @Override
    @Transactional
    public Company update(Company company) {
        return repository.save(company);
    }

    @Override
    public List<Company> saveAll(List<Company> companies) {
        return repository.saveAll(companies);
    }

    @Override
    public Optional<Company> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public List<Company> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Company insert(Company company){ return repository.insert(company);}

    public List<String> getCompaniesSymbol(){
        return repository.getCompaniesSymbol();
    }
}
