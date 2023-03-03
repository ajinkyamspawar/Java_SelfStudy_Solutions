/*1. Model Date entity having data members as dd,mm,yy. 
	Include the functionality for showDate and use this class for 
	creating object from main method.*/

package oopinjava1;

public class Date { 
	
	int dd,mm,yy; //instance variables
	
	public Date(){
		
		dd = 03;
		mm=03;
		yy=2023;
		System.out.println("Default constructor is called.");
		
	}
	
	public void showDate() {
		System.out.println("showDate Date is: "+dd+"/"+mm+"/"+yy); //showDate method, used to display default values from default constructor
	}
	
	public void display(int d, int m, int y) {
		
		System.out.println("Date through display methods is: "+d+"/"+m+"/"+y); // display method parameters passed through main method  
																																			 // aca display method with arguments as arguments for parameters are passed from main.
		
	}
	
}
