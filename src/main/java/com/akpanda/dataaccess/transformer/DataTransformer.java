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

    public Employee transformEmployeeNodelToEntity(EmployeeData employeeData,Company company){
        Employee employee = new Employee();
        employee.setCompany(company);
        employee.setDesignation(employeeData.getDesignation());
        employee.setEmployeeName(employeeData.getEmployeeName());
        employee.setSalary(employeeData.getSalary());
        employee.setEmployeeId(employeeData.getEmployeeId());
        return employee;
    }

    public EmployeeData transformEmployeeEntityToModel(Employee employee){
        EmployeeData employeeData = new EmployeeData();
        employeeData.setEmployeeName(employee.getEmployeeName());
        employeeData.setEmployeeId(employee.getEmployeeId());
        employeeData.setDesignation(employee.getDesignation());
        employeeData.setSalary(employee.getSalary());
        CompanyData companyData = this.transformCompanyEntityToModel(employee.getCompany());
        employeeData.setCompanyData(companyData);
        return employeeData;
    }

    private CompanyData transformCompanyEntityToModel(Company company){
        CompanyData companyData = new CompanyData();
        companyData.setCompanyCity(company.getCompanyCity());
        companyData.setCompanyCode(company.getCompanyCode());
        companyData.setCompanyName(company.getCompanyName());
        companyData.setCompanyId(company.getCompanyId());
        return companyData;
    }
}
