/* Write a program to check whether the given number is prime or not */
package selfStudy;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static void main(String[] args)
	{
		boolean flag = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check whether it is prime or not.");
		int number = sc.nextInt();
		
		for(int i = 2; i <= number/2 ; ++i)
		{
			if(number % i == 0)
			{
				flag = true;
				break; 
			}
		}
		if(flag == false)
			System.out.println("It is a Prime Number");
		else
			System.out.println("It is not a Prime Number");
		
	}

}


/* In Java, the boolean keyword is a primitive data type. It is used to store only two possible values,
 *  either true or false. 
 * It specifies 1-bit of information and its "size" can't be defined precisely. */

/* Scanner input = new Scanner(System.in); Creates a new object of type Scanner from the standard input of the program 
 * (in this case probably the console) and int i = input.nextInt()
 *  uses the nextInt Method of that object, which allows you to enter some text and it will be parsed into an integer.*/
 
 

