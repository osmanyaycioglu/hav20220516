package com.java.design.patterns.common;


public class Person {

    private String  name;
    private String  surname;
    private String  phone;
    private Integer height;

    public String getName() {
        return name;
    }

    public Person setName(String nameParam) {
        name = nameParam;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Person setSurname(String surnameParam) {
        surname = surnameParam;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Person setPhone(String phoneParam) {
        phone = phoneParam;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public Person setHeight(Integer heightParam) {
        if (height > 300) {
            throw new IllegalArgumentException("height 300 den büyük olamaz");
        }
        height = heightParam;
        return this;
    }


}
