package Bonus;

public class Test
{

	public static void main(String[] args) 
	
	{
		  User U1 = new User(1234 , " Fahim " , " 1111password ");
		  Customer C1 = new Customer (" Fahim ", " Sakib ", " Dhaka ");
		  Product P1 = new Product ( 444 , " Phone " , 500000.00);
		  Order O1 = new Order ( 5555 , C1 , P1);
		  U1.Usershow();
		  O1.Show();
		  
		  
	}

}
