package com.java.design.patterns.creational.builder;


public class PersonImmutable {

    private final String  name;
    private final String  surname;
    private final String  phone;
    private final Integer height;

    private PersonImmutable(String nameParam,
                            String surnameParam,
                            String phoneParam,
                            Integer heightParam) {
        super();
        name = nameParam;
        surname = surnameParam;
        phone = phoneParam;
        height = heightParam;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getHeight() {
        return height;
    }

    public static PersonImmutableBuilder getBuilder() {
        return new PersonImmutableBuilder();
    }

    public static class PersonImmutableBuilder {

        private String  name;
        private String  surname;
        private String  phone;
        private Integer height;

        private PersonImmutableBuilder() {

        }

        public String getName() {
            return name;
        }

        public PersonImmutableBuilder withName(String nameParam) {
            name = nameParam;
            return this;
        }

        public String getSurname() {
            return surname;
        }

        public PersonImmutableBuilder withSurname(String surnameParam) {
            surname = surnameParam;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public PersonImmutableBuilder withPhone(String phoneParam) {
            phone = phoneParam;
            return this;
        }

        public Integer getHeight() {
            return height;
        }

        public PersonImmutableBuilder withHeight(Integer heightParam) {
            height = heightParam;
            return this;
        }

        public PersonImmutable build() {
            if (name == null) {
                throw new IllegalArgumentException("name null olamaz");
            }
            return new PersonImmutable(name,
                                       surname,
                                       phone,
                                       height);
        }

        public PersonImmutable buildV2() {
            return new PersonImmutable(name,
                                       surname,
                                       phone,
                                       height);
        }

    }
}
