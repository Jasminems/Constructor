/*A Java program to perform default,one and two argument constructor*/
import java.io.*;
class A
{
	int n;
	String name;
	//default constructor
	A()
	{
		System.out.println("Default Constructor called");
	}
	//One-argument constructor
	A(String name)
	{
		System.out.println(""+name);
	}
	//Two-argument constructor
	A(String name,int age)
	{
		System.out.println(""+name+" ,"+age);
	}
}
public class B 
{
	public static void main(String[] args) 
	{
		A ob1=new A();
		A ob2=new A("Jasmine");
		A ob3=new A("Jasmine",32);
	}
}