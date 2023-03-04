package oopinjava1;

public class AppPoint {
	
	public static void main(String[] args) {
	
		
		Point coordinates = new Point();				//default constructor is called
		coordinates.showCoordinates('[',']');
		
		Point coordinates1 = new Point(30,40); // parameterized constructor is called. 
		coordinates1.showCoordinates('[',']');
	}

}
