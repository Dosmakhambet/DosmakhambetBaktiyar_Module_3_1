package com.dosmakhambetbaktiyar.stocks.repository;

import com.dosmakhambetbaktiyar.stocks.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CompanyRepository extends MongoRepository<Company,String> {

    @Query("SELECT symbol FROM company")
    List<String> getCompaniesSymbol();
}
