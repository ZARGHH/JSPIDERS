package simple.java;
import java.util.Scanner;
public class Trigo {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("ENTER THE FIRST ANGLE");
int b=sc.nextInt();
System.out.println("ENTER THE SECOND ANGLE");
	double m=(22.0/(7.0*180))*a;
	double n=(22.0/(7.0*180))*b;
	double p=(Math.tan(m)-Math.tan(n)/(1+Math.tan(m)*Math.tan(n)));
	System.out.println("the value is"+p);
			
			
	
	}

}
