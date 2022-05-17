package com.java.design.patterns.structural.flyweight;

//10_000
//1 employee 25 bytes
//250_000 bytes
// 3000
// 253_000
public class EmployeeFlyWeight {

    private String     name;
    private String     surname;
    private Department department;

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

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(final Department departmentParam) {
        this.department = departmentParam;
    }


}
