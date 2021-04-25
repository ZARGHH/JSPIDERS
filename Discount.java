package simple.java;
import java .util.Scanner;

public class Discount {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
double d=0,amt=0;
System.out.println("ENTER THE AMOUNT OF PURCHASE");
if(p<=2000)
{
	d=p*5.0/100.0;
	System.out.println("GIFT:WALL CLOCK");
}
if(p>=2001||p<=5000)
{
	d=p*10.0/100.0;
	System.out.println("GIFT SCHOOL BAG");
}
if(p>=5001||p<=10000) {
d=p*15.0/100.0;
System.out.println("GIFT ELECTRIC IRON");
}
if(p>1000)
{
	d=p*20.0/100.0;
	System.out.println("WRIST WATCH");
}
	amt=p-d;
	System.out.println("Amount of Purchase"+p);
	System.out.println("Discount is"+d);
	System.out.println("Amount to be paid"+amt);
	}

}
