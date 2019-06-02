package com.akpanda.dataaccess.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CompanyData {

    @SerializedName("companyName")
    private String companyName;

    @SerializedName("companyId")
    private String companyId;

    @SerializedName("companyCity")
    private String companyCity;

    @SerializedName("companyCode")
    private String companyCode;

    private List<EmployeeData> employeeList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<EmployeeData> getEmployeeList() {
        if(this.employeeList==null){
            employeeList = new ArrayList<>();
        }
        return employeeList;
    }

    public void setEmployeeList(List<EmployeeData> employeeList) {
        this.employeeList = employeeList;
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
}
