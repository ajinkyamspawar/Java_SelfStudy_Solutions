/*2. Add Default, Parameterized, Copy constructor. 
   Create objects using all the constructors.*/

package oopinjava1;

public class UnderstandingConstructors {
	
	int monday,tuesday,wedensday;
	
	
	
	public UnderstandingConstructors() {  																						//default constructor
		monday = 1;
		tuesday = 2;
		wedensday =3; 
		
	}
	
	
	
	public UnderstandingConstructors(int monday, int tuesday, int wedensday) {				//parameterized constructor 																											
		this.monday = monday;
		this.tuesday = tuesday;
		this.wedensday = wedensday;
	}
	
	
	
	public UnderstandingConstructors(UnderstandingConstructors c) {							//Copy Constructors
		this.monday = c.monday;
		this.tuesday = c.tuesday;
		this.wedensday = c.wedensday;
	}
	
	
	public void showDay() {																											//default constructors output is displayed using this method
		System.out.println("This first output is related default constructors output.");
		System.out.println(""+monday+","+tuesday+","+wedensday);	
		
	}
	
	
	
	public void showDayParametrized() {																			//Parameterized constructors output is displayed using this method
		System.out.println("This second output is related to parametrised constructors output");
		System.out.println(""+monday+","+tuesday+","+wedensday);	
	}
	
	
	
	public void showDayCopy() {																					//copy constructors output is displayed here
		System.out.println("This third output is related to parametrised constructors output");
		System.out.println(""+monday+","+tuesday+","+wedensday);	
		
	}
}
