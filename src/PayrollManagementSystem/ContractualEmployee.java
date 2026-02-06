package PayrollManagementSystem;

public class ContractualEmployee implements Employee {
	String empId;
	String empName;
	String Department;
	String type ="Contractual";
	double hourWorked;
	double hourlyRate;
	double totalsal;
	@Override
	public void calculateSalary() {
		double sal = hourWorked*hourlyRate;
		totalsal = sal-(sal*0.10);
	}
	
	@Override
	public String toString() {
		return "ContractualEmployee [empId=" + empId + ", empName=" + empName + ", Department=" + Department + ", type="
				+ type + ", hourWorked=" + hourWorked + ", hourlyRate=" + hourlyRate + ", totalsal=" + totalsal + "]";
	}

	public ContractualEmployee(String empId, String empName, String department, double hourWorked, double hourlyRate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.Department = department;
		this.hourWorked = hourWorked;
		this.hourlyRate = hourlyRate;
		
	}
	
	
	
	
	
	
}
