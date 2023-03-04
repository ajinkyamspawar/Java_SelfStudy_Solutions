package oopinjava2;

public class AppComplex {
	
	public static void main(String[] args) {
		
		Complex number = new Complex();
		number.display();
		
		Complex number1 = new Complex(2,4);
		number1.display();
		
		Complex number2 = new Complex(3,-9);
		number2.display();
	}

}

/*Output is: 
  Complex number is:1x+4i
Complex number is:2x+4i
Complex number is:3x-9i*/
