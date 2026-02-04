package Array;

import java.util.Scanner;

public class MultiArray {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int [][]studentMarks= new int [3][3];
	for (int i = 0; i < studentMarks.length; i++) {
		System.out.println("Enter the marks of Student " +(i+1));
		for (int j = 0; j < studentMarks[i].length; j++) {
		
			studentMarks[i][j]=sc.nextInt();
		}}
			
			
	for (int i = 0; i < studentMarks.length; i++) {
		int tmarks=0;
		for (int j = 0; j < studentMarks[i].length; j++) {
			tmarks+=studentMarks[i][j];
		}
		System.out.println("Total marks of student "+(i+1)+" "+tmarks);
	}
}
}
