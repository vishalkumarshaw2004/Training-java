package PayrollManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatePay {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("press 1.If you are Permanent Employee");
			System.out.println("press 2.If you are Contractual Employee");
			System.out.println("Enter Your choice");
			int choice = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter Your Employee Id");
			String id = sc.nextLine();

			System.out.println("Enter Your name");
			String name = sc.nextLine();

			System.out.println("Enter Your Department");
			String department = sc.nextLine();

			if (choice == 1) {
				System.out.println("Enter Your base Salary ");
				double bs = sc.nextDouble();

				if (bs <= 0) {
					throw new InvalidSalaryException("Base salary should be greater than 0");
				}

				System.out.println("Enter Your HRA ");
				double hra = sc.nextDouble();

				if (hra < 0) {
					throw new InvalidSalaryException("HRA cannot be negative");
				}

				PermanentEmployee p =
						new PermanentEmployee(id, name, department, bs, hra);

				p.calculateSalary();
				System.out.println(p);
			}
			else if (choice == 2) {
				System.out.println("Enter Your worked hours ");
				double hw = sc.nextDouble();

				if (hw <= 0) {
					throw new InvalidSalaryException("Worked hours should be greater than 0");
				}

				System.out.println("Enter Your Hourly rate ");
				double hr = sc.nextDouble();

				if (hr <= 0) {
					throw new InvalidSalaryException("Hourly rate should be greater than 0");
				}

				ContractualEmployee c =
						new ContractualEmployee(id, name, department, hw, hr);

				c.calculateSalary();
				System.out.println(c);
			}
			else {
				System.out.println("Invalid choice ");
			}

		}
		catch (InvalidSalaryException e) {
			System.out.println("Salary Error  : " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Input Error  : Please enter valid numeric values");
		}
		catch (Exception e) {
			System.out.println("Something went wrong : " + e.getMessage());
		}
		
	}
}
