package simple.java;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int age= sc.nextInt();
	int x=age;
	int x1=x+5;//age after 5 years
	int x2=x-5;//age before 5 yeras
	System.out.println("the age after 5 years"+x1);
	System.out.println("the age before 5 years"+x2);
	System .out.println("the present age is"+x);
		

	}

}
