package Question2;

public class Test 

{

	public static void main(String[] args) 
	{
		Address A1 = new Address ( " Dhaka ", " Bangladesh ");
		Employee E1 = new Employee (111  , " Rony ",  10000.00, A1);
		System.out.println(E1);
		
		E1.Show();
		
		System.out.println();
		
		Address A2 = new Address ( " Dinajpur ", " Bangladesh ");
		Employee E2 = new Employee (222  , " Saif ",  50000.00, A2);
		E2.Show();
		
		
		
		
		

	}

}
