package OOPS;

public class StaticNonstatic {
	
	int a = 10;
	static int b = 20;
	void m1() {
		System.out.println("i am non static");
	}
	static void m2()
	{
		System.out.println("i am a static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * 1. static methods and static variable can be accessible in another static method directly no need of object creation  to access non static methods and variables we need object
 * Ex : main is static you can directly print static varibles and directly call static methods in main no object required
 * 
 * 
 *condition if you want to call static methods and variables in another class in the static method itself but you need to call using class name 
 *
 *2. non static method to access in static method we always require object t
 *
 *3. in Non static method you can access everything directly
 * 
 * 
 */
		
		System.out.println(b);
		
		m2();
		
		StaticNonstatic  sn =new  StaticNonstatic();
		sn.m2();
		sn.a = 10;
		System.out.println(sn.a);
	}

}
