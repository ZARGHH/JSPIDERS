package simple.java;
import java.util.Scanner;
public class ROUND {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
double r=sc.nextDouble();
 Area(r);
	
	
	
	}
	
	
	
	static void Area( double a)
	
	{
		System.out.println("area is "+(3.14*a*a));
		Math.round(3.14*a*a);
	}
	}




