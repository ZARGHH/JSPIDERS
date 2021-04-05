package simple.java;
import java.util.Scanner;
public class Biggest {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 3 integer value");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
if(x>y&&x>z)
{ 
	System.out.println("the largest number is"+x);
}
else if(y>z)
{
	System.out.println("the largest number is "+y);

	}
else
{
	System.out.println("the largest number is"+z);
	
}
	}

}
