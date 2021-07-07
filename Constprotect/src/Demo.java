/*A Java program to apply protected access modifier to the constructor*/
class Demo
{
	//protected constructor
	protected Demo()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) 
	{
		Demo d=new Demo();

	}

}
