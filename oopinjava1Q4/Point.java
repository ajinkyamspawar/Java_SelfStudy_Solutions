/*4. Create a class Point having data members as x, y (co-ordinates). 
	Add appropriate constructors and method to display 
	the co-ordinates like [10,20]*/
package oopinjava1;

public class Point {
	
	private int x,y; 		//instance data members
	
	public Point() {			//default constructor 
		
		x = 10;
		y = 20;
		System.out.println("Co-ordinates displayed as 10,20 indicate that they are obtained from default constructor.");
	}
	
	public Point(int x, int y) {	//parameterized constructors
		super();
		this.x=x;
		this.y=y;
		System.out.println("Co-ordinates displayed as 30,40 indicate that they are obtained from parameterized constructor.");
	}
	
	public void showCoordinates(char ch, char ch1) {		//instance member method
		System.out.println(ch+""+x+","+y+""+ ch1);
	}

}
