package simple.java;
import java.util.Scanner;

public class Area 
{
	

	public static void main(String[] args)
	{

		   Scanner sc = new Scanner(System.in);
	        System.out.println("enter the number");
	        int s = sc.nextInt();
	        int l = sc.nextInt();
	        int b = sc.nextInt();
	        int h = sc.nextInt();
	        
	       area(s);
	       area(l,b);
area(l,b,h);

	    }

	    static void area(int a)
	    {
	       System.out.println(a*a) ;
	    }

	    static void area(int l, int b)
	    {
	        System.out.println(l * b);
	    }

	    static void area(int l, int b, int h)
	    {
	        System.out.println(l * b * h);
	}


}