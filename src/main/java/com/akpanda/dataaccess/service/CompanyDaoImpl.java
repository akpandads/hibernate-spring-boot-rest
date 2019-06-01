package com.akpanda.dataaccess.service;

import com.akpanda.dataaccess.entity.Company;
import com.akpanda.dataaccess.service.repository.ComapanyDaoRepository;
import com.akpanda.dataaccess.service.repository.EmployeeDaoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CompanyDaoImpl {

    private Logger logger = LoggerFactory.getLogger(CompanyDaoImpl.class);

    @Autowired
    private ComapanyDaoRepository companyDaoRepository;

    public Company findByCompanyId(String companyId){
        Optional<Company> company = companyDaoRepository.findByCompanyId(companyId);
        if(company.isPresent())
            return company.get();
        return null;
    }

    public Company saveCompany(Company company){
        return companyDaoRepository.save(company);
    }
}
