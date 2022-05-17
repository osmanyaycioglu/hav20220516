package com.java.design.patterns.structural.flyweight;

// 10_000
// 1 employee 100 bytes
// 1_000_000 bytes
public class Employee {

    private String name;
    private String surname;
    private String department;
    private String departmentLocation;
    private String departmentNumber;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

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
