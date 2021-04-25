package simple.java;
import java.util.Scanner;

public class TRIANGLE {

	public static void main(String[] args) {
System.out.println("MAIN METHOD STARTED");
Scanner sc=new Scanner(System.in);
System.out.println("enter the three side of triangle");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
 if((a==b) && (b==c) && (c==a))
 {
	 System.out.println("IT is an equilateral Triangle");
	 
 }
 else if((a==b)|| (b==c)||(c==a))
 {
	 System.out.println("IT IS AN ISOCLES TRAINGLE");
	 
 }
 else
	 System.out.println("IT IS A SACLENE TRAINGLE");
	System .out.println("MAIN METHOD ENDED");
	}

}
