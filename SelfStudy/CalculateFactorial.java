package selfStudy;

import java.util.Scanner;

public class CalculateFactorial {
	public static void main(String[] args) {

		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter a number to calculate it's factorial");
		
		int number = sc.nextInt();
		
		//int number = 5;
		
		
		 int fact = 1;
		
		for (int i = 1; i<=number ; i++) //for loop is used so that the value of the i can be incremented to multiply with each value of fact to get factorial
		{
			fact = fact * i;
		}
		System.out.println("Factorial of a number is: " +fact);

	}


}
