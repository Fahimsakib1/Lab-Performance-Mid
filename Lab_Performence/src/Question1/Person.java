package Question1;

public class Person 
{
   
	public String Name;
	public int Age;
	
	public String getName() 
	{
		return Name;
		
	}
	public void setName(String name) 
	{
		Name = name;
	}
	
	public int getAge() 
	{
		return Age;
	}
	
	public void setAge(int age) 
	{
		Age = age;
	}
	
	
	
	public Person() 
	{
		
	}
	
	public Person(String name, int age) 
	{
		super();
		Name = name;
		Age = age;
	}
	
	
	
	
	
	
}
