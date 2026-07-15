package basics;

public class TestCaseSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] environments = {"DEV", "QA", "STAGING", "PROD"};
//		for(int i = 0 ; i<environments.length;i++)
//		{
//			System.out.println("Environement value : " +environments[i]);
//		}
//		
//		for (String environement : environments) {
//			
//			System.out.println("Environement value : " +environement);
//		}
		String[] browsers = {"chrome", "firefox", "edge"};
		String name = "Selenium";

		System.out.println(browsers.length);
		System.out.println(name.length());
		
		
		
//EmailPasswordExpected Resultadmin@selenium.comadmin123Login Successuser@selenium.comuser456Login Successwrong@selenium.combadpassLogin Failed
		
//		
//		String[][] loginData = {{"admin@selenium.com","admin123", "Login Success"},
//		
//		{"user@selenium.com","user456","Login Success"},
//		
//		{"wrong@selenium.com ", "badpass","Login Failed"}
//		};
//		
//		for(int i = 0 ;i< loginData.length ;i++) {
//			for(int j = 0;j<loginData[i].length;j++)
//			{
//				System.out.println("--- Test Report ---");
//				if(i==0) {
//				System.out.println("Test 1: " + loginData[i][j])
//				}
//			}
//		}
		
		//find 300 present in array 
		boolean status = false;
		int [] elementArray = {100,200,300,400,500};
		int searchElement  = 300 ;
//		for(int element :elementArray) {
//			if (element == searchElement) {
//				System.out.println("elementFound " );
//				status = true ;
//				break;
//			}
//		}
		
//		for(int i = 0; i< elementArray.length;i++) {
//			if(searchElement == elementArray[i] )
//			{
//				System.out.println("elementFound " );
//				status = true ;
//				break;
//			}
//		}
//		if(status == false)
//		{
//			System.out.println("ElementnotFound");
//		}
		
		
		int[] a = {10,20,30,40,10,20,50,10,10,10,10};
		
		int i = 0;
		int findValue = 10;
		for (int value :a) {
			
			if(findValue == value) {
				
				i++;
			}
		}
		
		System.out.println("i value : " +i);
		
	}	
	
}
