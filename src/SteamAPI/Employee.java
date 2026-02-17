package SteamAPI;

public class Employee {

	private String empId;
	private String empName;
	private double salary;
	private int age;
	private String department;

	public Employee(String empId, String empName, double salary, int age, String department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.age = age;
		this.department = department;
	}
	public String getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getSalary() {
		return salary;
	}
	public int getAge() {
		return age;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", age=" + age
				+ ", department=" + department + "]";
	}

	
	
}
