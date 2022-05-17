package com.java.design.patterns.structural.flyweight;


public class Department {

    private String department;
    private String departmentLocation;
    private String departmentNumber;

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(final String departmentParam) {
        this.department = departmentParam;
    }

    public String getDepartmentLocation() {
        return this.departmentLocation;
    }

    public void setDepartmentLocation(final String departmentLocationParam) {
        this.departmentLocation = departmentLocationParam;
    }

    public String getDepartmentNumber() {
        return this.departmentNumber;
    }

    public void setDepartmentNumber(final String departmentNumberParam) {
        this.departmentNumber = departmentNumberParam;
    }


}
