package com.dosmakhambetbaktiyar.stocks.service;

import com.dosmakhambetbaktiyar.stocks.model.Company;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
    @Transactional
    Company save(Company company);

    @Transactional
    Company update(Company company);

    @Transactional
    List<Company> saveAll(List<Company> companies);

    Optional<Company> findById(String id);

    List<Company> findAll();

    Company insert(Company company);

    List<String> getCompaniesSymbol();
}
