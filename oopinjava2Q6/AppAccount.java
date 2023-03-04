package oopinjava2;

public class AppAccount {
	
	public static void main(String[] args) {
		
		Account acc = new Account();				//object for default constructor
		acc.display();
		
		Account acc1 = new Account(101,1000.96);	//object for parameterized constructor
		acc1.display();
	}

}
