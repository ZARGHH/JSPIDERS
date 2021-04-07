package simple.java;
import java.util.Scanner;

public class Integer 
{
public static void main(String args [])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the values of the Rectangle");
	int l=sc.nextInt();
	int b=sc.nextInt();
	Area(l,b);
	
	Perimetre(l,b);
	
	
}
static void Area(int l,int b)
{ 
	System.out.println(("area of the rectangle is"+l*b));
}
static void Perimetre( int l,int b)
{
System.out.println("perimeter of a reactangle is"+(2*(l+b)));
}
}