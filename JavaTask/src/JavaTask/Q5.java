package JavaTask;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        Long num = s.nextLong();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

	}

}
