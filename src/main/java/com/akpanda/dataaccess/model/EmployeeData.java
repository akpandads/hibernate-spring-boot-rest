package com.akpanda.dataaccess.model;

import com.akpanda.dataaccess.entity.Company;
import com.akpanda.dataaccess.entity.enums.DesignationEnum;

public class EmployeeData {


    private String employeeId;
    private String employeeName;
    private Integer salary;
    private DesignationEnum designation;
    private Company company;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public DesignationEnum getDesignation() {
        return designation;
    }

    public void setDesignation(DesignationEnum designation) {
        this.designation = designation;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
