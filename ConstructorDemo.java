package OOPS;

public class ConstructorDemo {
	
	int x,y;
	
	ConstructorDemo(){
	     x = 100;
		 y  = 200;
	}
	
	ConstructorDemo(int a ,int b){
		x = a;
		y = b;
		
	}
	void sum() {
		System.out.println("printing sum of a and b " + (x+y));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd = new ConstructorDemo(300,400);
		cd.sum();
		
	

	}

}
