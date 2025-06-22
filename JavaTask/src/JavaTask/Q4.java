package JavaTask;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.print("Enter Value a: ");
        int a = s.nextInt();

        System.out.print("Enter value b: ");
        int b = s.nextInt();


        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swaped value: a = " + a + ", b = " + b);

	}

}
