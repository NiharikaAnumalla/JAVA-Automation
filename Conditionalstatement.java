package basics;

public class Conditionalstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 16;
		if(age >= 18) {
			System.out.println("Access Granted");
		}
		else
		{
			System.out.println("Access Denied");
		}


	int score = 85;
	if (score >=90)
	{
		System.out.println("GRADE A");
	}
	else if (score >=80)
	{
		System.out.println("GRADE B");
	}
	else if (score >=70)
	{
		System.out.println("GRADE C");
	}
	else if (score >=60)
	{
		System.out.println("GRADE D");
	}
	else if (score >=50)
	{
		System.out.println("GRADE E");
	}
	else
	{
		System.out.println("GRADE F");
	}
boolean isLoggedIn = true;
String role = "Admin";
if (isLoggedIn = true)
{
	if(role.equals("Admin"))
	{
		System.out.println("Full Access");
	}
	else {
		System.out.println("Limited Access");
	}
}
else
{
	System.out.println("Please Login");
}

int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");   // ← this runs
        break;
    case 4:
        System.out.println("Thursday");
        break;
    default:
        System.out.println("Invalid day");
        break;
}
String browser = "firefox";
switch (browser) {
case "chrome":
	System.out.println("Launching ChromeDriver");
break;
case  "firefox" :
	System.out.println("Launching GeckoDriver");
	break;
case "edge":
	System.out.println("Launching EdgeDriver");
	break;
default :
	System.out.println("Browser not supported");
	break;
}

}
}