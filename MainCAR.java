package simple.java;
import java.util.Scanner;

class car
{
	String colour;
	double price;
	double speed;
	int number;
	String name;
	
	void drive()
	{
		System.out.println("colour of the car is"+colour);
		System.out.println("price of the car is"+price);
		System.out.println("engine speed of the car is"+speed);
		System.out.println("number of the care is"+number);
		System.out.println("name of the car is"+name);
		
	}
	 void getcarinfo()
	{
		 System.out.println("this is car information");
		
	}
}






public class MainCAR {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("MAIN METHOD STARTED");
		
		
		car c1=new car();
		car c2=new car();
		System.out.println("****************************");
	
		c1.colour=sc.next();
		c1.price=sc.nextDouble();
		c1.speed=sc.nextDouble();
		c1.number=sc.nextInt();
		c1.name=sc.next();
		System.out.println("****************************");
		c2.colour=sc.next();
		c2.price=sc.nextDouble();
		c2.speed=sc.nextDouble();
		c2.number=sc.nextInt();
		c2.name=sc.next();
		System.out.println("****************************");

c1.drive();
System.out.println("****************************");
c1.getcarinfo();
System.out.println("****************************");
c2.drive();
System.out.println("****************************");
c2.getcarinfo();
System.out.println("****************************");
System.out.println("MAIN METHOD ENDED");



		
	}

}
