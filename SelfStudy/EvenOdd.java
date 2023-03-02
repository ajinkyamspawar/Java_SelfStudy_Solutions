package selfStudy;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is even or odd");
		int number = sc.nextInt();
		if(number % 2 == 0)
		{
			System.out.println("Number is even");
			
		}
		else
		{
			System.out.println("Number is odd");
		}
		
	}

}
