import java.util.Scanner;
class Deposit 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
double p,r,a;
int n,ch;
System.out.println("MENU LIST");
System.out.println("TERM DEPOSIT");
System.out.println("RECURRING DEPOSIT");
System.out.println("Enter Your Choice");
ch=sc.nextInt();
switch(ch)
		{
	case 1:
System.out.println("ENTER THE RATE ,TIME,PRINCIPAL");
p=sc.nextDouble();
r=sc.nextDouble();
n=sc.nextInt();
a=p*Math.pow((1+r/100),n);
System.out.println("AMOUNT IS"+a);
break;
case 2:
System.out.println("ENTER THE RATE ,TIME,PRINCIPAL");
p=sc.nextDouble();
r=sc.nextDouble();
n=sc.nextInt();
a=p*n+p*(n*(n+1))/2*r/100.0*1.0/12.0;
System.out.println("Amount is"+a);
break;
default:
	System.out.println("WRONG CHOICE");
		}
	}
}
