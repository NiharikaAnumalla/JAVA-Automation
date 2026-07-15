package OOPS;

public class ThisClass {
	int x,y; //class variable or instance variable
	
	ThisClass(int x,int y){
		this.x =x;
		this.y =y;   //constructor is created with the class name
		
		//if both are same to differentiate class variable install variable use this. variable name
		
	}
	//even it is same for normal methods
	void display() {
		System.out.println(x + " and " + y );
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//constructor is called automatically once object is created
		
		ThisClass tsc = new ThisClass(10,20);
		tsc.display(); //now x = x and y= y it means logical incorrect 

	}

}
