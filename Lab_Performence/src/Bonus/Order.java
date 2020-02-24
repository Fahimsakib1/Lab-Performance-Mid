package Bonus;

public class Order 
{
  public int ID;
  Customer customer;
  Product product ;
  
  
public Order() 
{
	
}


public Order(int iD, Customer customer, Product product) 
{
	super();
	ID = iD;
	this.customer = customer;
	this.product = product;
	
}

public void Show() 
{     
	
	
	System.out.println(" Order ID : " + ID);
	
	System.out.println(" Customer's First Name  : " + customer.FirstName);
	System.out.println(" Customer's Last Name  : " + customer.LastName);
	System.out.println(" Customer's Address  : " + customer.Address);
	
	System.out.println(" Product ID  : " + product.ID);
	System.out.println(" Product Name  : " + product.Name);
	System.out.println(" Product Price  : " + product.Price);

	
	
}


  
  
  
  
}
