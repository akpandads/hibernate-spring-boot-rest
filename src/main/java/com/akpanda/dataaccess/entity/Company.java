package com.akpanda.dataaccess.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="COMPANY_DETAILS")
@SequenceGenerator(name="company_seq_generator", initialValue=101, allocationSize=100)
public class Company {

    @Id
    @GeneratedValue(generator = "company_seq_generator",strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private Long id;

    @Column(name="company_name")
    private String companyName;

    @Column(name="company_id")
    private String companyId;

    @Column(name="company_address")
    private String companyCity;

    @Column(name="company_code")
    private String companyCode;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "company")
    private List<Employee> employees;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
