package simple.java;
import java .util.Scanner;

class production
{
	int id;
	String name;
	double price;
	
	void productinfo()
	{
		System .out.println("id is"+id);
		System.out.println("name is "+name);
		System.out.println("price is"+price);
	}
	
	
	
}







public class MainProduct {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner (System.in);	
System.out.println("MAIN METHOD STARTED");
	production p1=new production();
	production p2=new production();
	production p3=new production();
p1.id=sc.nextInt();
p1.name=sc.next();
p1.price=sc.nextDouble();
	
p2.id=sc.nextInt();
p2.name=sc.next();
p2.price=sc.nextDouble();

p1.id=sc.nextInt();
p1.name=sc.next();
p1.price=sc.nextDouble();
System.out.println("************************");
p1.productinfo();
System.out.println("************************");
p2.productinfo();
System.out.println("************************");
p3.productinfo();
System.out.println("************************");


	
	}

}
