package com.akpanda.dataaccess.entity.enums;

public enum DesignationEnum {
    DEVELOPER("Developer"),
    MANAGERIAL("Managerial"),
    ADMIN_STAFF("Admin Staff"),
    TESTER("Tester");

    private String value;
    DesignationEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
