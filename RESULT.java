package simple.java;
import java .util.Scanner;

public class RESULT {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("MAIN METHOD STARTED");
System.out.println("ENTER THE NAME OF THE STUDENT");
String name=sc.next();
	System.out.println("ENTER THE MARKS OF THE STUDENT");
	int marks=sc.nextInt();

if(marks>80)
{
	System.out.println("DISTINCTION");
}
else if(marks>=60 && marks<80)
{
	System.out.println("FIRST DIVISION");
	
}
else if( marks>=45 && marks <60)
	{
	System.out.println(" SECOND DIVISION");
	}
else if( marks>=40 && marks <45)
{
	System.out.println("  PASS DIVISION");

}
else {
	System.out.println("FAIL");
}
System.out.println(" MAIN METHOD ENDED");


	}

}
