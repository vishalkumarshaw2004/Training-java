package PayrollManagementSystem;

public class PermanentEmployee implements Employee {
	String empId;
	String empName;
	String Department;
	String type ="Permanent";
	double baseSalary ;
	double totalsal;
	double hra;
	@Override
	public void calculateSalary() {
		totalsal = baseSalary + hra;
		
		
	}
	
	@Override
	public String toString() {
		return "PermanentEmployee [empId=" + empId + ", empName=" + empName + ", Department=" + Department + ", type="
				+ type + ", baseSalary=" + baseSalary + ", totalsal=" + totalsal + ", hra=" + hra + "]";
	}
	public PermanentEmployee(String empId, String empName, String department, double baseSalary, double hra) {
		super();
		this.empId = empId;
		this.empName = empName;
		Department = department;
		this.baseSalary = baseSalary;
		this.hra = hra;
	}
	
	
}
