package JavaTask;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		System.out.println("Please Enter your text :");
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();

        // Get and print the length of the string
        int length = a.length();
        System.out.println("The length of the string is " + length);

	}

}
