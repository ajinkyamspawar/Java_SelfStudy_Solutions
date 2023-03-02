package selfStudy;

import java.util.Scanner;

public class FindDivisors {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find out it's all the divisors");
		int number = sc.nextInt();
		int i =1;
		for ( ; i<=number; i++)
		{
		if(number % i == 0)
		{
			
			System.out.print(i+",");
			
		}
		
		
		}
		
		
	}
	

}
