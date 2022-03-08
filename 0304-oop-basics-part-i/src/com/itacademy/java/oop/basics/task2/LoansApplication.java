package com.itacademy.java.oop.basics.task2;

import java.time.LocalDate;
import java.util.ArrayList;

public class LoansApplication {
    public static void main(String[] args) {
        Customer customer = new Customer("Vardas", "Pavardė", 35, "111222333");

        Loan loan1 = new Loan("#01", 2000, LoanType.LEASING, LocalDate.of(2022, 5, 01));
        Loan loan2 = new Loan("#02", 50000, LoanType.CONSUMER_LOAN, LocalDate.of(2025, 01, 01));

        ArrayList<Object> loans = new ArrayList<Object>();
        loans.add(loan1);
        loans.add(loan2);





    }
}