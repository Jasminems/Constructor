/*A Java program to call default and argument constructor of super class from child class*/
class Fruit
{
	//default constructor
	Fruit()
	{
		System.out.println("This is Fruit");
	}
	//argument constructor
	Fruit(String type)
	{
		System.out.println("Type:"+type);
	}
}
class Mango extends Fruit
{
	Mango()
	{
		//calling argument constructor using super()of the parent class
		super("Fruit");
		System.out.println("This is Mango");
	}
}
public class Intersuperclas 
{
	public static void main(String[] args) 
	{
		Mango m=new Mango();

	}
}