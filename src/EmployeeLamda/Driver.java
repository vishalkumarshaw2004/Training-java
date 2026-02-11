package EmployeeLamda;

import java.util.Scanner;
import java.util.function.Function;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empId, empName and sal");
		String empId = sc.next();
		String empName = sc.next();
		double sal = sc.nextDouble();
		Employee emp = new Employee(empId, empName, sal);
		
		Function<Employee, Double> revisedSal = e -> e.sal * 1.15;
		System.out.println("Revised Salary: " + revisedSal.apply(emp));
		emp.sal = revisedSal.apply(emp);
		System.out.println(emp);
		
	}
}
