package com.akpanda.dataaccess.entity;

import com.akpanda.dataaccess.entity.enums.DesignationEnum;

import javax.persistence.*;

@Entity
@Table(name = "employee_details")
public class Employee {
    @Id
    @GeneratedValue(generator = "company_seq_generator",strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name="employee_id")
    private String employeeId;

    @Column(name ="employee_name")
    private String employeeName;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "designation")
    private DesignationEnum designation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
