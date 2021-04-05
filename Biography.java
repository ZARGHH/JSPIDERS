package simple.java;
import java.util.Scanner;

public class Biography {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner (System.in);
System.out.println("what is your name");
String s=sc.next();
System.out.println("what is your phone number");
long l=sc.nextLong();
System.out.println( "my name is"+s+"and my phone number is"+l);

	}

}
