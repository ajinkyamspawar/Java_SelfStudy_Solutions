package oopinjava1;

public class AppBox {
	
	public static void main (String[] args) {
		
		Box defaultVolume = new Box();								//object of default constructor 
		
		Box parameterizedVolume = new Box(8,9,10);  //object of parameterized constructor
		
		Box cube = new Box(5);											//object of cube related constructor 
		
		double vol;
		
		
		//to get volume of first box where no values are given
		vol = defaultVolume.volume();
		System.out.println("Volume from default constructor is:" +vol);
		
		//to get volume of second box where values are given 
		vol = parameterizedVolume.volume();
		System.out.println("Volume from parameterized constructor is: " +vol);
		
		//to get volume of third box where cube related values are given 
		vol = cube.volume();
		System.out.println("Volume from cube related constructor is: " +vol);
		
		
	}
}
