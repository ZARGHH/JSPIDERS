package simple.java;
import java .util.Scanner;
public class Four {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("eneter the four value");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();		
	if
	(a>b && a>c && a>d)
		System.out.println("a is the biggest"+a);
	else if(b>c && b>a && b>d)
		System.out.println("b is biggest"+b);
	else if(c>b && c>a && c>d)
		System.out.println("c is biggest"+c);
	else
		System.out.println("d is biggest");


	
	}

}
