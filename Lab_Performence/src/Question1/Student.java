package Question1;

   public class Student extends Person
   {
	
   public int ID;
   public double CGPA;
   
   
   
   
     public Student() 
     {
	super();  
	
     }

	 public Student(String name,int age,int iD, double cGPA) 
     {
    	 
	  super();
	  Name=name;
	  Age=age;
	  ID = iD;
	  CGPA = cGPA; 
	
     }
	 
	 
	 
	 public void ShowInfo()
	 {
		 
		 System.out.println(" Name Of The Student Is : " + Name);
		 System.out.println(" Age of Student Is : " + Age + " Years");
		 System.out.println(" ID : " + ID);
		 System.out.println(" CGPA  : " + CGPA);
		 
	 }
	 

     
     
  
    	 	
   
 }

