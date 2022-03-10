package basics.task1;

import java.time.LocalDate;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = new Employee("Zivile", "D", ContractType.FULL_TIME, LocalDate.of(2022, 03, 03), 5000, "frontend");

        System.out.println(employee.toString());
    }
}
