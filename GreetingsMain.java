package OOPS;

public class GreetingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greetings gr = new Greetings();
		gr.m1();
		String Str =  gr.m2();//if a method is a returning we need an object to store the value
		System.out.println("printing string return " +Str);
		gr.m3("Niharika");
		String name = gr.m4("Venkat");
		System.out.println("Hi From niharika " +name);

	}

}
