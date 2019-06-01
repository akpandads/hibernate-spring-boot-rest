package com.akpanda.dataaccess.model;

import com.google.gson.annotations.SerializedName;

public class CompanyData {

    @SerializedName("companyName")
    private String companyName;

    @SerializedName("companyId")
    private String companyId;

    @SerializedName("companyCity")
    private String companyCity;

    @SerializedName("companyCode")
    private String companyCode;

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
