package Array;

import java.util.Scanner;

public class Avg {
public static void main(String[] args) {
	int[] marks = new int[5];
	float add=0;
	float avg = 0;
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < marks.length; i++) {
		System.out.println("Enter the marks of subject "+i);
		marks[i]=sc.nextInt();
		
	}
	for (int i = 0; i < marks.length; i++) {
		add+=marks[i];
	}
	avg =add/marks.length;
	System.out.println("Avg marks :"+avg);
}
}
