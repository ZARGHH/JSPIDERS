package simple.java;
import java.util.Scanner;
 class square
 {
	 int side;
	 
 void squareinfo()
	 {
		 System.out.println("side of the square is"+side);
		 System.out.println("area of the square is"+getArea());
	 System.out.println("perimeter of the square is"+getper());
	 
	 }
	  int getArea()
	  {
		  return side*side;
	  }
	  int getper()
	  {
		  return 4*side;
	  }


public static class MAINSquare 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
System.out.println("main method started");
square s1=new square();
square s2=new square();
s1.side=sc.nextInt();
System.out.println("****************************");
s2.side=sc.nextInt();
System.out.println("****************************");
s1.getArea();
System.out.println("****************************");
s1.getper();
System.out.println("****************************");
s2.getArea();
System.out.println("****************************");
s2.getper();
System.out.println("****************************");
 System.out.println("MAIN METHOD ENDED");
}
}
 }

	



 
