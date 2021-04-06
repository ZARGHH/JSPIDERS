package simple.java;
import java.util.Scanner;
public class Leap {

	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter your year");
int year=sc.nextInt();
int c=year%4;
if(c==0)
	System.out.println("IT IS A LEAP YEAR");
else
	System .out.println(" IT IS NOT A LEAP YEAR");
	}

}
