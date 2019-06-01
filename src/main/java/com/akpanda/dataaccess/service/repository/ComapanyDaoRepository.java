package com.akpanda.dataaccess.service.repository;

import com.akpanda.dataaccess.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ComapanyDaoRepository extends JpaRepository<Company,Long> {
    @Override
    Optional<Company> findById(Long aLong);

    Optional<Company> findByCompanyId(String companyId);

}
