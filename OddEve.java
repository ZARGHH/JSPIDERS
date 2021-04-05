package simple.java;
import java.util.Scanner;
public class OddEve {

	public static void main(String[] args) 
	{
Scanner sc= new Scanner(System.in);
System .out.println("enter your number");
int n=sc.nextInt();
int c=n%2;
if(c==0)
{
	System.out.println("the number is even");
}
else
{
	System.out.println("the number is odd");
}
	}

}
