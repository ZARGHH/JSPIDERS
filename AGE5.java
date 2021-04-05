package simple.java;
import java.util.Scanner;

public class AGE5 {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter your age");
int n=sc.nextInt();

	if
	(n>=18)
	{	System.out.println("you are eligible to vote");
	System .out.println("you are eligible  to vote for last"+(n-10)+"years");
}
else
	{
		
		System.out.println("you are not elgible");
		System.out.println("you are elgible to vote from"+(n+3)+"years");
	}
	
}

	}


