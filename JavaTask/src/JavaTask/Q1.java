package JavaTask;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        // Check if the sum of a and b is greater than the sum of c and d
        if ((a + b) > (c + d)) {
            System.out.println("The sum of a and b is greater than the sum of c and d.");
        }
        else {
        	System.out.println("The sum of a and b is Lesser than the sum of c and d.");
        }

	}

}
