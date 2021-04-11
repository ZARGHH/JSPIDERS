package simple.java;
import java.util.Scanner;

public class METHODOVERLOADING2 {

	public static void main(String args[]) 
	{
	Scanner sc=new Scanner(System.in);
System.out.println("enter your number");
	int n=sc.nextInt();
	double  b =sc.nextDouble();
	String a=sc.next();
	
	
	name(n);
	System.out.println("the integer is "+n);
	name(b);
	System.out.println("the double value is"+b);
	name(a);
	System.out.println("the String is"+a);
	
	
	
	}
	
	
	static int name(int a)
	{
	return a;
	}
	static double name(double x)
	{
		return x;
	}
	static String name(String y)
	{
		return y;
	}
		
	
	
	
	
	}
	


