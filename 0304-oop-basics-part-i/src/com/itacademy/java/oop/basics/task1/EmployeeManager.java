package com.itacademy.java.oop.basics.task1;

import java.time.LocalDate;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Zivile", "D", ContractType.FULL_TIME, LocalDate.of(2022, 03, 03), 5000, "frontend");

        System.out.println(employee1.toString());
    }
}
