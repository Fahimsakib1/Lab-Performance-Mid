package Bonus;

public class Customer extends User
{
    public String FirstName;
    public String LastName;
    public String Address;
    
    
	public Customer() 
	{
		super();
		
	}


	public Customer(String firstName, String lastName, String address) 
	{
		super();
		
		FirstName = firstName;
		LastName = lastName;
		Address = address;
	}
	
	/**public void Usershow()
	 {
		    
		    System.out.println(" User ID : " + ID);
			System.out.println(" User Name  : " + UserName);
			System.out.println(" User's Password  : " + Password);
	 }**/


	
	
    
    
}
