package ex_23042024;

import java.util.Scanner;

public class Largest_using_ternary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int a = sc.nextInt();

		System.out.println("Please enter the second number");
		int b = sc.nextInt();

		System.out.println("Please enter the third number");
		int c = sc.nextInt();

		int d = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("The largest number is: "+d);

		sc.close();
	}
}
