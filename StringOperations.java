package basics;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "   Selenium   ";

//		System.out.println(text.length());
//		System.out.println(text.trim());
//		System.out.println(text.trim().length());
//		System.out.println(text.length());
//		String a = "Selenium";
//		String b = "Selenium";
//		String c = new String("Selenium");
//
//		System.out.println(a == b);
//		System.out.println(a == c);
//		System.out.println(a.equals(c));
//		System.out.println(a.equalsIgnoreCase("SELENIUM"));
//		String url = "https://www.google.com/search";
//
//		System.out.println(url.contains("google"));
//		System.out.println(url.contains("Google"));
//		System.out.println(url.startsWith("https"));
//		System.out.println(url.startsWith("http://"));
//		System.out.println(url.endsWith("/search"));
//		System.out.println(url.endsWith("/Search"));
		
		String pageTitle  = "   Google Search   ";
		String pageUrl    = "https://www.google.com/search?q=selenium";
		String errorMsg   = "Error: Invalid Username or Password";
		String browserRaw = "CHROME";
		String title = pageTitle.trim();
		System.out.println(title.contains("Google"));
		System.out.println(pageUrl.startsWith("https")&& pageUrl.endsWith("/search?q=selenium"));
		System.out.println(pageUrl.indexOf("s"));
//		System.out.println(pageUrl.substring(34,-1));
       if(errorMsg.contains("Invalid")) {
    	   System.out.println("Login Failed");
    	   
       }
       String  lowerCasebrowserRaw = browserRaw.toLowerCase();
		System.out.println(lowerCasebrowserRaw);
		String errorMsgCorrection = errorMsg.replace("Error", "Login Failed ");
		System.out.println(title.charAt(0));
		System.out.println(lowerCasebrowserRaw.equals("chrome"));
	}

}
