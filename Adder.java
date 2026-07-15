package OOPS;

public class Adder {

/*
 * polymorphism  : which means many forms one method many forms we can use we can use in different ways
 * Ex : General examples Water water has many forms it should be in liquid form it should in vapour form it should be ice form one water showcasing many forms
 * Same way to achieve polymorphism we need to follow method overloading
 *4.same method name
 *1. same method but it has variables
 *2.same method order of creating variables different
 *3.same method data type of variable is different
 *
 * 
 * 
 * 
 */
	int a = 10;
	int b = 20;
	
	
	void sum()
	{
		System.out.println("sum of two variables : " +(a+b)); //1 same method name all the methods
	}
	void sum(int x,int y) //2 But it has two variables
	
	{
	System.out.println("sum of two variables :  " +(x+y));	 
	}
	void sum(int x ,double y)
	{
		System.out.println("Sum of two variables : " +(x+y)); //Different variables
	}
	void sum(double x ,int y)
	{
		System.out.println("sum of two variables : " +(x+y)); //order of creating variable 
	}

}


/*
 * constructor overloading
 * 1.method name should be the same
 * 2.number of parameters are different
 * 3.data type of parameter is different
 * 4.order of parameters different
 * 
 */
