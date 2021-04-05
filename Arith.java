package simple.java;
import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  two integer values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+"+"+b+"="+(a+b));
		 System.out.println(a+"*"+b+"="+(a*b));
		 System.out.println(a+"-"+b+"="+(a-b));
		 System.out.println(a+"/"+b+"="+(a/b));
		 System.out.println(a+"%"+b+"="+(a%b));
	}

}
