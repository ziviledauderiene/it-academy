package com.itacademy.java.oop.basics.task2;

import java.time.LocalDate;

public class Loan {
    private String id;
    private double amount;
    private LoanType loanType;
    private LocalDate terminationDate;

    public Loan(String id, double amount, LoanType loanType, LocalDate terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", loanType=" + loanType +
                ", terminationDate=" + terminationDate +
                '}';
    }
}
