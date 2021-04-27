import java.util.Scanner;
class Triangle2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("MAIN METHOD STARTED");
		 int c,s,a,b,m,n,p;
		 double k,area;
		 System.out.println(" 1.area of equilateral triangle");
System.out.println("2:Area of isocles Triangle");
System.out.println("3:Area of scalene Triangle");
System.out.println("Enter your choice");
c=sc.nextInt();
switch(c)
		{
	case 1:
		System.out.println("enyter the side of the equilateral traingle");
	s=sc.nextInt();
	area=(Math.sqrt(3)*s*s)/4.0;
	System.out.println("area of equilateral triangle is"+area);
	break;
	case 2:
		System.out.println("ENTER THE SIDE AND BASE OF THE ISCOCELES TRIANGLE");
	a=sc.nextInt();
	b=sc.nextInt();
	area=b/4.0*(Math.sqrt(4*a*a-b*b));
	System.out.println("Area of the ISCOLES TRIANGLE IS"+area);
break;
case 3:
System.out.println("enter the side of the scalene triangle");
m=sc.nextInt();
n=sc.nextInt();
p=sc.nextInt();
k=(m+n+p)/2.0;
area=Math.sqrt(k*(k-m)*(k-n)*(k-p));
System.out.println("the area of scalene triangle is"+area);
break;
default:
	System.out.println("Wrong choice");
		}


	}
}
