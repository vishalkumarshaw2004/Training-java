package SteamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterEmployee {
	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();
		l.add(new Employee("E001", "Alice", 50000, 23, "IT"));
		l.add(new Employee("E002", "sebrina", 40000, 35, "Hr"));
		l.add(new Employee("E002", "sabby", 60000, 35, "Hr"));
		l.add(new Employee("E002", "Juli", 60000, 35, "Hr"));
		l.add(new Employee("E002", "Albert", 60000, 35, "Hr"));

		l.add(new Employee("E003", "Meera ", 55000, 45, "Marketing"));

		Optional<Employee> oldest = l.stream().max((a1, a2) -> Integer.compare(a1.getAge(), a2.getAge()));
		System.out.println(oldest);

		Map<String, Long> count = l.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(count);
		// get avg salaray in each dept
		Map<String, Double> avgSalary = l.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalary);
		//get employees whose salary is above average
		double overallAvgSalary = l.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("Overall Average Salary: " + overallAvgSalary);
		
		List<Employee> aboveAvgSalary = l.stream()
				.filter(e -> e.getSalary() > overallAvgSalary)
				.collect(Collectors.toList());
		System.out.println("Employees with above average salary:");
		aboveAvgSalary.forEach(System.out::println);
		
		
		
	}

}

