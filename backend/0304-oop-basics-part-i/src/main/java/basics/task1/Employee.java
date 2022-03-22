package basics.task1;

import java.time.LocalDate;

public class Employee {
    private final String name;
    private final String surname;
    private final ContractType contractType;
    private final LocalDate contractStartDate;
    private final double salary;
    private final String position;

    public Employee(String name, String surname, ContractType contractType, LocalDate contractStartDate, double salary, String position) {
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
