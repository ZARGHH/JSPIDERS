package simple.java;
import java.util.Scanner;

public class POSITVE {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter your number");
int n=sc.nextInt();

if(n>0)
	System.out.println(n+  "number is positve");
else
	System.out.println(n+  "number is negative");
	}

}
