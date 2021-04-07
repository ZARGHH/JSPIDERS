package simple.java;
import java.util.Scanner;
public class SimpleIntrest {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the values");
double p=sc.nextDouble();
double r=sc.nextDouble();
double t=sc.nextDouble();

 simple(p,r,t);
 compound(p,r,t);
 


	}

static void simple(double p,double r,double t)
{
	System.out.println("Simple Intrest is"+(p*r*t/(100)));
}
static void compound(double p,double r,double t)
{
 double ci;
ci=p*(Math.pow((1+r/100),t));
System.out.println("COMPUND INTREST IS"+ci);
}
	






	}


