package com.itacademy.java.oop.basics.task2;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
    private String name;
    private String surname;
    private int age;
    private String personalNumber;
    private Loan[] loans;

    public Customer(String name, String surname, int age, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", personalNumber='" + personalNumber + '\'' +
                ", loans=" + Arrays.toString(loans) +
                '}';
    }
}
