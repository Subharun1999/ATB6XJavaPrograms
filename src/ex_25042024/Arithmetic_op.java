package ex_25042024;

import java.util.Scanner;

public class Arithmetic_op {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();

		System.out.println("Enter the second number: ");
		int b = sc.nextInt();

		System.out.println("Enter the operation you want to perform: ");
		char ch = sc.next().charAt(0);

		switch (ch) {
			case '+': {
				int result = a + b;
				System.out.println(a + "+" + b + "=" + result);
				break;
			}
			case '-': {
				int result = a - b;
				System.out.println(a + "-" + b + "=" + result);
				break;
			}

			case '*': {
				int result = a * b;
				System.out.println(a + "*" + b + "=" + result);
				break;
			}

			case '/': {
				int result = a / b;
				System.out.println(a + "/" + b + "=" + result);
				break;
			}

			default:
				System.out.println("Invalid Operator");
		}

		sc.close();
	}
}
