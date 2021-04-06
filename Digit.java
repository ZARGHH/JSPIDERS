package simple.java;
import java.util.Scanner;
public class Digit 
{
public static void main(String args[])
{
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the value");
	int n=sc.nextInt();
	if(n>9)
		System.out.println(" the value is a number");
	else
		System.out.println(" the value is a digit");
}
}
