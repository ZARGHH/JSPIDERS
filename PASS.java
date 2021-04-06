package simple.java;
import java.util.Scanner;

public class PASS {

	public static void main(String[] args) 
	{
Scanner sc= new Scanner (System.in);
System.out.println("eneter the four subject marks");
int p=sc.nextInt();
int c=sc.nextInt();
int b=sc.nextInt();
int m=sc.nextInt();
if(p>35 && c>35 && b>35 && m>35)
	System.out.println("PASS");
else
	System.out.println("FAIL");

	}

}
