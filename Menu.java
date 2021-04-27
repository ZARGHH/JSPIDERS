import java.util.Scanner;

class Menu 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
System.out.println("enter the value");
System.out.println("enter the length of the rectangle");
int l=sc.nextInt();
System.out.println("enter the breadth of the rectangle");
int b=sc.nextInt();
System.out.println("enter the choice");
int n=sc.nextInt();
int ar,per;
double d;
switch(n)
		{
	 case 1:
		 ar=l*b;
	 System.out.println("area is"+ar);
	 break;
	 case 2:
		 per=2*(l+b);
	 System.out.println("perimeteris"+per);
	 break;
	 case 3:
	 d=Math.sqrt(l*l+b*b);
	 System.out.println("Diagnol is"+d);
break;
default:
 System.out.println("wrong choice");
	}
}
}