package basics.task2;

import java.util.Arrays;

public class Customer {
    private final String name;
    private final String surname;
    private final int age;
    private final String personalNumber;
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
