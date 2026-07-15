package basics;

import java.util.Scanner;

public class InputAcceptFromUser {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the city : " );
		//int Num  = sc.nextInt(); // integer
		 String city = sc.next();
		System.out.println("City is " +city);
	}
	
	

}
