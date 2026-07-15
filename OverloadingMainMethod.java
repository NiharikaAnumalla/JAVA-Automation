package OOPS;

public class OverloadingMainMethod {
	
	
	void main(int number) {
		
		System.out.println(number);
	}
	
	void main(String s) {
		
		System.out.println(s);
		
	}
	
	void main(String s1 ,String s2)
	{
		System.out.println(s1 +""+ s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingMainMethod method  = new OverloadingMainMethod();
		method.main(1);
		method.main("heloo");
        method.main("niha", "kanna");

	}

}
