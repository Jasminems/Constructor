/*A Java program to apply default access modifiers to the constructor*/
class A
{
	//default access modifiers to the constructor
	A()
	{
		System.out.println("Hello");
	}
}
public class Main 
{
	public static void main(String[] args) 
	{
		A ob=new A();

	}

}
