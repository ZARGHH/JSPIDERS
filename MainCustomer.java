package simple.java;
import java .util.Scanner;

class cinfo
{
	int id;
	String name;
	double sal;
	

void customerinfo()
{
	System.out.println("customer id is"+id);
	System.out.println("customer name is"+name);
	System.out.println("customer salary is"+sal);
}
}



public class MainCustomer 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
System.out.println("MAIN METHOD STARTED");
	cinfo c1=new cinfo();
	cinfo c2=new cinfo();
	cinfo c3=new cinfo();
	System.out.println("**************************");
c1.id=sc.nextInt();
c1.name=sc.nextLine();
c1.sal=sc.nextDouble();
System.out.println("**************************");
c2.id=sc.nextInt();
c2.name=sc.nextLine();
c2.sal=sc.nextDouble();
System.out.println("**************************");
c3.id=sc.nextInt();
c3.name=sc.nextLine();
c3.sal=sc.nextDouble();
System.out.println("**************************");
c1.customerinfo();
System.out.println("**************************");
c2.customerinfo();
System.out.println("**************************");
c3.customerinfo();
System.out.println("**************************");

	}

}
