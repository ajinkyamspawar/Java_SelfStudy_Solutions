/*5. Create Complex class with data member real and imaginary.Define display method which print complex number like  3x+5i.
make provision to display appropriate result if imaginary part is negitive.*/
package oopinjava2;

public class Complex {
	
	private int real, imaginary;						//instance variables
	
	public Complex() {										//default constructors
		
		real = 1;
		imaginary = 4;
		
	}
	
	public Complex(int r, int i) {					//Parameterized constructor		
		
		this.real = r;
		this.imaginary = i; 
		
	}
	
	public void display() {						//display method 
		if(imaginary > 0)
		{
		System.out.println("Complex number is:" +real+"x+"+imaginary+"i"); //provision wrt positive values is made 
		}
		else
		{
			System.out.println("Complex number is:"+real+"x"+imaginary+"i"); //provision wrt negative values is made
		}
	}

}
