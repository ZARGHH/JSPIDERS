package simple.java;
import java.util.Scanner;

public class Distinction {

	public static void main(String[] args) 
	{
Scanner sc= new Scanner(System.in);
System.out.println("enter the 10th Percentage");
double marks=sc.nextDouble();
if(marks>=85)
	System.out.println("DISTINCTION");
else if(marks>=60)
	System.out.println("FIRST CLASS");
else if(marks>=35)
	System.out.println("PASS");
else
	System.out.println("FAIL");
	}

}
