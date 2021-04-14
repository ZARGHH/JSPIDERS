package simple.java;
class Detail
{
	int cid;
	String cname;
	String cstatus;
	double salary;
	
	void condition() 
	{
		System.out.println("person is retired");
		}
		
		void purchase() 
		{
		System.out.println("customer is purchasing");
		
	}
}


public class Customer {

	public static void main(String[] args) 
	{
System.out.println("Main method started");
Detail sc=new Detail();
sc.condition();
sc.purchase();
System.out.println( "Customer id is"+sc.cid);
System.out.println("customer name is"+sc.cname);
System.out.println("Customer status is"+sc.cstatus);
System.out.println("customer salary is"+sc.salary);
System.out.println("main method ended");

	
	
	}

}
