package Thread;

public class Table {
	// you have to print a table of 2 using one thread and then a table of 5 using another thread using sleep method to print first table then another table seperately
	public void printTable(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}
		
	}
	
}
