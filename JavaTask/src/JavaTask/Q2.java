package JavaTask;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();

        // Check if the number is even
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        }
        else {
        	System.out.println(number + " is an odd number.");
        }

	}

}
