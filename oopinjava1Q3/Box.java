/*3. Create a class called Box to maintain height, width and depth. 
    Also write a function which calculates volume of the box. 
	Add default constructor, full parameterized constructor and 
	parameterized constructor for creating object having 
	same length, breadth and depth.
	Create the object and display calculated volume.*/
package oopinjava1;

public class Box {
	
	double height, width, depth; 
	
	
	public Box() {																									//default constructor
		height = width = depth=0;
		System.out.println("No values are specified, hence output is zero. Output of default constructor is zero as below.");
	}
	
	
	public Box(double h, double w, double d) 											//Constructor used when all dimensions are specified. 
	{
		height=h;
		width=w;
		depth=d;
	}
	
	public Box(double len) {																	//Constructor is used when all the values are same i.e. values of cube are given. 
		height = width = depth = len;
	}
	
	public double volume() {																//method to compute and return the volume
		return height*width*depth;
	}
	
	
}
