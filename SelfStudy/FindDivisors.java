package selfStudy;

import java.util.Scanner;

public class FindDivisors 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find out it's all the divisors");
		int number = sc.nextInt();
		int count = 0;
		for ( int i =1; i<=number; i++)
		{
			if(number % i == 0) // It will check whether the number is divisible by assigned value of i or not. 
			{
			count++;
			System.out.print(i+","); // If the number is divisible by the assigned value of i then it will print the number. 
			
			}
		
		
		}
		System.out.println("\nTotal Number of divisors are:" +count); // Returns the total number of integers. 
		
	}
	

}
