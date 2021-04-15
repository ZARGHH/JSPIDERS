package simple.java;
import java.util.Scanner;
class INFO
{
	double r;
	double area;
	double circumference;
	void circleinfo()
	{
		System.out.println("Radius is"+r);
		System.out.println("area is"+getArea());
		System.out.println("circumference is"+getCircumference());
		}
   double getArea()
  {
return 3.143*r*r;	  
		}
   double getCircumference()
  {
	  return 2*3.143*r;
		
	}

	
}
	




public class CIRCLE {
	public static void main(String[] args) {
System.out.println("MAN METHOD STARTED");
	Scanner sc=new Scanner(System.in);
	INFO C1=new INFO();
	INFO C2=new INFO();
	INFO C3=new INFO();
	C1.r=7.8;
	C2.r=8.9;
	C3.r=sc.nextDouble();

	C1.circleinfo();
	C2.circleinfo();
	C3.circleinfo();
	
	System.out.println("MAIN METHOD ENDED");
	}

}
