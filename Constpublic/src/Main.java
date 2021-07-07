/*A Java program to apply public access modifiers to the constructor*/
class Company
{
	String name;
	//public constructor
	public Company()
	{
		name="Jasmine";
	}
}
public class Main 
{
	public static void main(String[] args) 
	{
		Company ob=new Company();
		System.out.println(ob.name);

	}

}
