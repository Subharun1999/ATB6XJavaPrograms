package ex_23042024;

import java.util.Scanner;

public class Prime_num {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int c = 0;

		if (num > 0)
		{
			for (int i = 1; i <= num ; i ++)
			{
				if(num % i == 0)
					c++;
			}
			if(c == 2)
			{
				System.out.println("Prime Number");
			}
			else {
				System.out.println("Not a Prime number");
			}
		}
		else {
			System.out.println("Not a prime number");
		}

	}
}
