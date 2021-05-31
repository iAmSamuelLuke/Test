import java.util.Scanner;
import java.util.Arrays;
public class lukeismyname {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] studentTest = new int[10][5];
		System.out.print("Enter the student test scores ");
		for(int row = 0; row < studentTest.length; row++) {
			for(int col = 0; col < studentTest[0].length; col++) {
				studentTest[row][col] = input.nextInt();
			}
				
		}
		System.out.println();
		for(int row = 0; row < studentTest.length; row++) {
			System.out.print("Student " + row + " test scores are ");
			int average;
		
			for(int col = 0; col < studentTest[0].length; col++) {
				average = (studentTest[row][0] + studentTest[row][1] + studentTest[row][2] + studentTest[row][3] + studentTest[row][4]) / 5;
				System.out.print(studentTest[row][col] + " ");
				if(col == studentTest[0].length - 1) {
					System.out.print(" average is " + average + ", ");
					printGrade(average);
				}
			}
			System.out.print("\n");
		}
		
		
	}
	public static void printGrade(int average) {
		if(average >= 90) {
			System.out.print("Grade is A");
			return;
		}
		if(average >= 80) {
			System.out.print("Grade is B");
			return;
		}
		if(average >= 70) {
			System.out.print("Grade is C");
			return;
		}
		if(average >= 60) {
			System.out.print("Grade is D");
			return;
		}
		else
			System.out.print("Grade is F");
}
}
