/*A Java program constructor with return type int and string*/
class Student 
{    
	int id;  
	String name;  
	Student(int i, String n)
	{  
		id = i;  
		name = n;  
	}  
	public static void main(String[] args) 
	{  
		//creation of object
		Student s = new Student(1,"Mithun");
		System.out.println(s.id); 
		System.out.println(s.name);
	}  
}  