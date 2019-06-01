package com.akpanda.dataaccess.service.repository;

import com.akpanda.dataaccess.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeDaoRepository extends JpaRepository<Employee,Long> {
    @Override
    Optional<Employee> findById(Long aLong);

    Optional<Employee> findByEmployeeId(String employeeId);
}
