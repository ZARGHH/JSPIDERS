package simple.java;
import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int s=sc.nextInt();
 int m,y,c,r;
 m=s*30;
 y=s*365;
 c=s/30;
 r=s/365;
 
 System.out.println("the conversion of  month to days is"+m);
 System.out.println("the conversions yeras to days is "+y);
 System.out.println("the conversion  of days to month is"+c);
 System.out.println("the conversion of days to year is"+r);
	}

}
