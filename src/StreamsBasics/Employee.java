package StreamsBasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
// remove name whose start from s employee object
public class Employee {
	String empId;
	String empName;
	double sal;
	public Employee(String empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
 
	
}
}
