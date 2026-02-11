package SortEmployeeStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25, 4000),
                new Employee("Bob", 30, 7000),
                new Employee("Charlie", 28, 8000),
                new Employee("David", 35, 4500),
                new Employee("Sophie", 32, 9000)
        );

        employees.stream()
                .filter(e -> e.getSalary() > 5000)
                .sorted(Comparator.comparingInt(Employee::getAge))
                .forEach(e -> {
                    double bonus = e.getSalary() * 0.10;
                    System.out.println(e + " | Bonus: " + bonus);
                });
    }
}
