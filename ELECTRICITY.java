package simple.java;
import java .util.Scanner;
public class ELECTRICITY {

	public static void main(String[] args) 
	{
		System.out.println("MAIN METHOD STARTED");
Scanner sc=new Scanner(System.in);
String name=sc.next();
System.out.println("ENTER THE NAME");
int n=sc.nextInt();
System.out.println("ENTER THE CONSUMER NUMBER");
int u=sc.nextInt();
System.out.println("ENTER THE UNIT");
double amt=0,total=0;
if(u<=100)
amt=u*5.50;
if(u>100 && u>=300)
	amt=100*5.50+(u+100)*6.50;
if(u>300 && u<=600)
amt=100*5.50+200*6.50+(u-300)*7.50;
if(u>600)
	amt=100*5.50+200*6.50+300*7.50+(u+600)*8.50;
System.out.println("enter the consumer number"+n);
System.out.println("ENTER THE CONSUMER NAME"+name);
System.out.println("enter the unit consumed"+u);
System.out.println("amount pais is"+amt);
System.out.println("main method ended");


	}

}
