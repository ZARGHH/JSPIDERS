package simple.java;
import java.util.Scanner;
class INF
{
	int l;
	int b;
	void rectangleinfo()
	{
		System.out.println("length is"+l);
		System.out.println("breadth is"+b);
		System.out.println("area is"+getArea());
		System.out.println("perimeter is"+getPer());
	}

		int getArea()
		{
			return l*b;
		}
 int getPer()
 {
	 return 2*(l+b);
 }
		
	
	
	
}


public class MainRetangle
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("MAIN METHOD STARTED");
	INF  R1=new INF();
	INF R2=new INF();
	INF R3=new INF();
	R1.l=7;
	R1.b=8;
	R2.l=5;
	R2.b=9;
	 R3.l=sc.nextInt();
	 R3.b=sc.nextInt();
	System.out.println("****************************");
	R1.rectangleinfo();
	System.out.println("****************************");
R2.rectangleinfo();
System.out.println("****************************");
R3.rectangleinfo();
System.out.println("****************************");

System.out.println("MAIN METHOD ENDED");
	
	 
	 
	}

}
