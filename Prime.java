package simple.java;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int i;
	if(n==1) 
	{
		System.out.println("prime number starts with 2");
		
	}
	for( i=2;i<n;i++)
	{
		if(n%i==0)
			System.out.println("number is  not prime");
		break;
	}
	if(n==i)

		System.out.println("it is  prime");
	
	}
}
