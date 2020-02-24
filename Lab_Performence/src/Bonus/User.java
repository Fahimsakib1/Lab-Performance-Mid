package Bonus;

public class User
{
    public  int ID;
    public String UserName;
    public String Password;
    
    
    
    
	public User() 
	{
	
		
	}


	public User(int iD, String userName, String password) 
	
	{
		super();
		ID = iD;
		UserName = userName;
		Password = password;
	}


	
	public String toString() 
	{
		return "User [ID=" + ID + ", UserName=" + UserName + ", Password=" + Password + "]";
	}
	
	 public void Usershow()
	 {
		 
		    System.out.println(" User ID : " + ID);
			System.out.println(" User Name  : " + UserName);
			System.out.println(" User's Password  : " + Password);
	 }
	
	
	
    
    
    
}
