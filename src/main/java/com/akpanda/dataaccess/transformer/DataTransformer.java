package com.akpanda.dataaccess.transformer;

import com.akpanda.dataaccess.entity.Company;
import com.akpanda.dataaccess.entity.Employee;
import com.akpanda.dataaccess.model.CompanyData;
import com.akpanda.dataaccess.model.EmployeeData;
import org.springframework.stereotype.Component;

@Component
public class DataTransformer {
    public Company transformCompanyModelToEntity(CompanyData companyData){
        Company company = new Company();
        company.setCompanyCode(companyData.getCompanyCode());
        company.setCompanyName(companyData.getCompanyName());
        company.setCompanyCity(companyData.getCompanyCity());
        company.setCompanyId(companyData.getCompanyId());
        return company;
    }

    public Employee transformEmployeeNodelToEntity(EmployeeData employeeData){
        Employee employee = new Employee();
        employee.setCompany(employeeData.getCompany());
        employee.setDesignation(employeeData.getDesignation());
        employee.setEmployeeName(employeeData.getEmployeeName());
        employee.setSalary(employeeData.getSalary());
        employee.setEmployeeId(employeeData.getEmployeeId());
        return employee;
    }
}
