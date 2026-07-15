package OOPS;

public class EncapsulationAccountDetails {
	/*
	 * encapsulation wrapping variables and method in one class
	 * accessing the variable from methods assign the variable setters and get the data using getters
	 * 1.all variable should be private
	 * 2.for every variable there should be 2 methods ( get and set)
	 * 3.variable can be operated through methods
	 */
	private int Accno;
	private String name;
	private double amount;
	
//	void setAccountnumber(int Accno) {
//		this.Accno = Accno ; //now this setter method will confuse what variable class variable what is public variable so to make it clear we use this keyword
//		//This key word will differenciate the class variable and method variable if you put this.Accno = Accno then this key word accouno is class variable
//	}
//	
//	int getAccountnumber(int Accno) {
//		return Accno;
//	}
	
//	now to get the getters and setters method using eclipse using source menu


	public int getAccno() {
		return Accno;
	}


	public void setAccno(int accno) {
		Accno = accno; 
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name; //if both variable are same then to differentiate we use this keyword
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	} 
	

}
