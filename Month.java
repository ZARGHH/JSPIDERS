package simple.java;
import java .util.Scanner;
public class Month {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the month number");
int s=sc.nextInt();
if(s==1)
	System.out.println("JANAUARY");
else if(s==2)
	System.out.println("FEBRUARY");
else if(s==3)
	System.out.println("MARCH");
else if(s==4)
	System.out.println("APRIL");
else if(s==5)
	System.out.println("MAY");
else if(s==6)
	System.out.println("JUNE");
else if(s==7)
	System.out.println("JULY");
else if(s==8)
	System.out.println("AUGUST");
else if(s==9)
	System.out.println("SEPTEMBER");
else if(s==10)
	System.out.println("OCTOBER");
else if(s==11)
	System.out.println("NOVEMBER");
else if(s==12)
	System.out.println("DECEMBER");
else
	System.out.println("INVALID CHOICE");

	}

}
