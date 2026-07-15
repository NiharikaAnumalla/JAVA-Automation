package basics;

import java.util.ArrayList;
import java.util.Arrays;

public class Sortting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sort below array  int[] elements  = { 10,20,50,90,49,54,32}
		
		int[] a = { 10,20,50,90,49,54,32};
		System.out.println("Before sorting the array : " +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting of the array :" +Arrays.toString(a));
		
		//sort below Strings  String[] Names = {"Niharika","Venkat", "Anu" ,"Chiluka"}

		String[] Names = {"Niharika","Venkat", "Anumalla" ,"Chilukamari"};
		System.out.println("Before sorting of the name string " +Arrays.toString(Names));
		Arrays.sort(Names);
		System.out.println("After sorting of the name string " +Arrays.toString(Names));
		
		//print Rever number array  String[] numberList = {10,20,30,40,50,60}
		
		int[] numberList  =  {10,20,30,40,50,60};
		ArrayList<Integer> reversed = new ArrayList<>();
		int[] reverseNumberList  = new  int[numberList.length];
		
		

		for (int i = numberList.length-1; i>=0;i--)
		{
			System.out.println("index value : " +numberList[i]);
			
			reversed.add(numberList[i]);
	
		}
		System.out.println( "List : " +reversed);
		
		for(int  i = 0;i<numberList.length-1;i++) {
			
			reverseNumberList[i] =numberList[ numberList.length-1-i];
		}
		
	}

}




