package OOPS;

public class Student {
	//class and objects part variable access
	String sname ;
	int sid;
	char sgrade;
	void DisplaySDetails()
	{
		System.out.println("Name of student " + sname + " id of the student " + sid + " Grade of the student " +sgrade);
//		System.out.println("");
	}

	
	void HighSchool(int id,String studentname ,char gr) {
		sname = studentname;
		 sid = id;
         sgrade = gr;
		
		
	}
	Student (String name,int id,char grade)
	{
		sname = name;
		sid = id;
		sgrade = grade;
		
	}
}
