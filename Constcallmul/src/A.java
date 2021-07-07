/*A Java program to call constructor multiple times*/
class A
{
	A()
    {
    }
	void print()
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Constructor is called\n");
		}
	}
	public static void main(String args[])
    {
        A ob=new A();
        ob.print();
        
    }
}