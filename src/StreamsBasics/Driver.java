package StreamsBasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Driver {
public static void main(String[] args) {
	Employee e1 = new Employee("E001", "Alice", 50000);
	Employee e2 = new Employee("E002", "Bob", 60000);
	Employee e3 = new Employee("E003", "Charlie", 55000);
	Employee e4 = new Employee("E004", "David", 70000);
	Employee e5 = new Employee("E005", "Sophie", 65000);

	List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);
	Stream<Employee> employeeStream = employees.stream();
	Stream<Employee> filteredStream = employeeStream.filter(e -> !e.empName.startsWith("S"));
	filteredStream.forEach(System.out::println);
}
}
