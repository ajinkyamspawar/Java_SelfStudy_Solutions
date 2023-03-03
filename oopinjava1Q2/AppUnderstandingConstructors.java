package oopinjava1;

public class AppUnderstandingConstructors {
	
	public static void main (String[] args) {
		
		UnderstandingConstructors constructors = new UnderstandingConstructors();
		constructors.showDay();
		
		UnderstandingConstructors constructors1 = new UnderstandingConstructors(8, 9, 10);
		constructors1.showDayParametrized();
		
		UnderstandingConstructors copyconstructors = new UnderstandingConstructors(constructors);
		copyconstructors.showDayCopy();	
		
		/*UnderstandingConstructors copyconstructors = new UnderstandingConstructors(constructors1);
		copyconstructors.showDayCopy();	*/ // used to copy the parameterized constructor
	}

}
