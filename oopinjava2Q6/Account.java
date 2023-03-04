/*6. Create a class Account which maintains information about accno and balance.
 * Implement all types of  constructors and display method which displays information about acco*/

package oopinjava2;

public class Account {
	
	private int accno;									
	private double balance;								//balance variable declared in double as it can be in points
	
	public Account() {											//default constructor
		
		accno = 0;
		balance = 0;
		System.out.println("Default constructors output:");
		
	}
	
	public Account(int accno, double balance) {		//parameterized constructors
		this.accno = accno;
		this.balance = balance; 
		System.out.println("Parameterized constructors output:");
	}
	
	public void display() {			
		System.out.println("Your accno is:"+accno+"\nYour account balance is:"+balance);
	}
	
	

}
