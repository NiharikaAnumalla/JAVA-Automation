package OOPS;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Acess variables in main class 3 different ways
		//1.Object reference
		
		
//		Student st  = new Student();
//		st.sgrade = 'A';
//		st.sid = 100;
//		st.sname = "Niharika";
//		st.DisplaySDetails();
		
		
		
		//2.using methods we can access variables the variables created inside the method are called local variable 
//		st.HighSchool(100, "Niharika", 'A');
//		st.DisplaySDetails();
		
		
		
		//3. Now using constructor you can access the variables 
		//i constructor name should be the class name
		//ii constructor does not return any value not even void
		//iii constructor use like method but we can only used for intializing variables
		//iv constructor doesnot need of creating variables it directly called once object created
		
		Student st  = new Student("Niharika" ,100,'A');
		st.DisplaySDetails();
		
		//Two types of constructor 1.Default 2.parameterized
		
		
		
		

	}

}
