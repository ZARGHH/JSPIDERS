package simple.java;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int x=sc.nextInt();
		
Factorial(x);//method calling
	}
		static void Factorial(int x)
		{
int fact=1;
for(int i=1;i<=x;i++)
{
	fact=fact*i;
	
}
System.out.println("factorial of the number is"+fact);
		}
		
		
		
	}


