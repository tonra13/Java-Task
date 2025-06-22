package JavaTask;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int num = s.nextInt();

        int count = 0;
        int temp = Math.abs(num); 

        if (temp == 0) {
            count = 1; 
        } else {
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("Number of digits in " + num + " is: " + count);

	}

}
