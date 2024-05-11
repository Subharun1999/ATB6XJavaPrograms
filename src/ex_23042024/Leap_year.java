package ex_23042024;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int yr = sc.nextInt();

		if((yr % 4 == 0) && (yr % 100 != 0) || (yr % 400 == 0))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}

		sc.close();
	}

}
