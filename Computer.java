package simple.java;
import java.util.Scanner;

public class Computer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int c,p;
c=sc.nextInt();
p=sc.nextInt();

int r1=15;
int r2=10;
 double d1=r1/100*c;
 double d2=r2/100*p;
 double m=c-d1;
 double n=p-d2;
 System.out.println("the discount on laptop is"+m);
 System.out.println("the discoubt on printer is"+n);
 
	}

}
