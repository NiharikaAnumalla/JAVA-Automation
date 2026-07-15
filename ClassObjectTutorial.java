package OOPS;

//import packagename.classname
public class ClassObjectTutorial {
//	int empid;
//	String ename;
//	String Dept;
//	void Display() {
//		System.out.println("emp id value " + empid);
//		System.out.println("ename  value " + ename);
//	}
//	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.empid = 1;
		emp.ename = "Niharika";
		emp.Dept = "CSE";
		emp.Display();
		//one class has several object each object will run individually 
		//one class doesn't have main method another class have main method the class variables and methods can be accessible in main method class
		//now in the above script i created a class employee which does n't have main i have executed the class variables and methods here
		//you can access other package classes but need to import
		

	}

}
