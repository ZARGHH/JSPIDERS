package simple.java;
import java.util.Scanner;

public class SQUARE1 {

	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of the square");
int s=sc.nextInt();


area(s);//method calling
perimetre(s);//method calling



	}
static void area(int s)
{
	System.out.println("Area is"+(s*s));
}
static void perimetre(int s)
{
	System.out.println("Perimetre is"+(4*s));

	}

}
