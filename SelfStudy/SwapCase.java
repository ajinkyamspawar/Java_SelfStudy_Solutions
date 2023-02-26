package SelfStudy;

public class SwapCase 
{
	public static void main(String[] args) 
	{
		int i = 5, j = 6;
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("Earlier values of i & j are 5 & 6 respectively.");
		System.out.println("Swapped values of i & j are " + i + " , " + j+".");
	}

}
/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Syntax error on token ""."", delete this token 
The exception in thread “main” java.lang.error: unresolved compilation problem: usually occurs due to syntax or typographical errors. 
Also, you might get the same exception due to using unknown or undefined classes and modules.
*/

/* Output is 
 
  
Earlier values of i & j are 5 & 6 respectively.
Swapped values of i & j are 6 , 5.


*/

