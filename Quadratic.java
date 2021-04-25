package simple.java;
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	int a,b,c;
	double d,r1=0,r2=0;
	System.out.println("enter the value of a,b,c ");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=Math.sqrt(b*b-4*a*c);
	if((d>0)||(d==0)) {
	r1=(-b+d)/(2.0*a);
	r2=(-b-d)/(2.0*a);
	System.out.println("THE ROOTS ARE"+r1+"and"+r2);
	}
	else
		System.out.println("the roots are imaginary");

}
}