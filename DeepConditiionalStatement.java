package basics;

public class DeepConditiionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chrome";
		int pageLoadTime = 4;
		int testScore = 85;
		int executionTime = 2;
		boolean isBrowserSupported = false;

		switch(browser) {
		case "chrome":
			System.out.println("Browser supported ,Launching ChromeDriver");
			 break;
		case "edge":
			System.out.println("Browser supported ,Launching EdgeDriver");
			
			 break;
		case "firefox":
			System.out.println("Browser supported,Launching GeckoDriver");
			 break;
		default :
			System.out.println("Browser not supported");
			 break;
		}
	}

}
