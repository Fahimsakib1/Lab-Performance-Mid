package Question2;

public class Employee 
{
   public int ID;
   public String Name;
   public double Salary;
   Address address;
   
   
public int getID() 
{
	return ID;
}

public void setID(int iD) 
{
	ID = iD;
}

public String getName() 
{
	return Name;
}

public void setName(String name) 
{
	Name = name;
}

public double getSalary() 
{
	return Salary;
}

public void setSalary(double salary) 
{
	Salary = salary;
}

public Address getAddress() 
{
	return address;
}

public void setAddress(Address address) 
{
	this.address = address;
}

public Employee(int iD, String name, double salary, Address address)

{
	super();
	ID = iD;
	Name = name;
	Salary = salary;
	this.address = address;
	
}


public String toString()
{
	return "Employee [ID=" + ID + ", Name=" + Name + ", Salary=" + Salary + ", address=" + address + "]";
}

public void Show()
{
	System.out.println(" ID : " + ID);
	System.out.println(" Name : " + Name);
	System.out.println(" Salary : " + Salary);
	System.out.println(" City : " + address.City);
	System.out.println(" Country : " + address.Country);
	
}


   
}
