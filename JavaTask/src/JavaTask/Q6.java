package JavaTask;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

	        // Ask user for input
	        System.out.print("Enter a number: ");
	        int num = s.nextInt();

	        long factorial = 1;

	        // Calculate factorial using a loop
	        for (int i = 1; i <= num; i++) {
	            factorial *= i;
	        }

	        // Display the result in format like "5! = 120"
	        System.out.println(num + "! = " + factorial);

	}

}
