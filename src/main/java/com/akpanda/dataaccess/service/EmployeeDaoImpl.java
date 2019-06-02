package com.akpanda.dataaccess.service;

import com.akpanda.dataaccess.entity.Company;
import com.akpanda.dataaccess.entity.Employee;
import com.akpanda.dataaccess.service.repository.ComapanyDaoRepository;
import com.akpanda.dataaccess.service.repository.EmployeeDaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EmployeeDaoImpl {
    @Autowired
    private EmployeeDaoRepository employeeDaoRepository;

    public Employee findByEmployeeId(String employeeId){
        Optional<Employee> employee = employeeDaoRepository.findByEmployeeId(employeeId);
        if(employee.isPresent())
            return employee.get();
        return null;
    }

    public void saveEmployee(Employee employee){
        employeeDaoRepository.save(employee);
    }

}
