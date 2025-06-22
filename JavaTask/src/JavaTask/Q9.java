package JavaTask;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = s.nextInt();

        if (age >= 60) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("Sorry, You are not a senior citizen.");
        }

	}

}
