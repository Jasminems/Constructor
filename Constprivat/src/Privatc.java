/*A Java program to apply for private access modifiers to the constructor*/
class A
{
	//Private constructor
	private A()
	{	
	}
	void print()
	{
		System.out.println("Private Constructor");
	}
}
public class Privatc 
{
	public static void main(String[] args) 
	{
		A ob=new A();//compile-time error

	}

}
