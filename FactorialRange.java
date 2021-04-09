package simple.java;
import java.util.Scanner;

public class FactorialRange {

	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter the range");
int n=sc.nextInt();
int fact=1;
while(n>0)
{
fact=fact*n;
	n--;
}	
	
System.out.println(fact);
}
}