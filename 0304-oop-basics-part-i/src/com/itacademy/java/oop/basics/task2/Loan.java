package com.itacademy.java.oop.basics.task2;

import java.time.LocalDate;

public class Loan {
    public String id;
    public double amount;
    public LoanType loanType;
    public LocalDate terminationDate;

    public Loan(String id, double amount, LoanType loanType, LocalDate terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }
}
