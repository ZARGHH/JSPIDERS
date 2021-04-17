package simple.java;
import java.util.Scanner;
class date
{
	int d,mm,yy;
	void date()
	{
		System.out.println("d/"+"mm/"+"yy");
	}
}



public class MAINDATE {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("MAIN METHOD STARTED");
System.out.println("enter the date");
date d1=new date();
date d2=new date();
	System.out.println("*************************");
	d1.d=sc.nextInt();
	d1.mm=sc.nextInt();
	d1.yy=sc.nextInt();
	d1.date();
	System.out.println("*************************");
	d2.d=sc.nextInt();
	d2.mm=sc.nextInt();
	d2.yy=sc.nextInt();
	d2.date();
	System.out.println("*************************");
	System.out.println("MAIN METHOD ENDED");


	}

}
