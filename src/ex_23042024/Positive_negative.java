package ex_23042024;

import java.util.Scanner;

public class Positive_negative {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter a integer number: ");
		int a= sc.nextInt();

		if(a>0){
			System.out.println("It is a Positive number");
		}
		else
		{
			System.out.println("Oops !! Negative number");
		}

		sc.close();
	}
}
