package com.itacademy.java.oop.basics.task1;

import com.itacademy.java.oop.basics.task1.ContractType;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String surname;
    private ContractType contractType;
    private LocalDate contractStartDate;
    private int salary;
    private String position;

    public Employee(String name, String surname, ContractType contractType, LocalDate contractStartDate, int salary, String position) {
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractType=" + contractType +
                ", contractStartDate=" + contractStartDate +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
