package basics;

public class Variables {
	int age  = 25;             //32 bit wholenumber till 2 billon
	String website = "https://www.amazon.com"; //heap memory //java.lang.string class
	char alpha ='A'; //single character
	double plot = 12.3456; //64 biit  more pprecision
	float area = 12.1f; //less precise start with f
	short a = 1500; //32000 to -32000
	long number = 99999999999999L;
	byte b= 100 ; //only -127 to 128
	boolean istrue = true;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables obj = new Variables();
		System.out.println("age is: " + obj.age);
		System.out.println("website is " + obj.website);
		System.out.println("alpha value is " +obj.alpha);
		System.out.println("plot value is : " +obj.plot);
		System.out.println("area value is : " +obj.area);
		System.out.println("a value is : " +obj.a);
		System.out.println("number is : " +obj.number);
		System.out.println("b value is: " +obj.istrue);
		
		

	}

}
