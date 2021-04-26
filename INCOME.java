package simple.java;
import java.util.Scanner;

public class INCOME {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("MAIN METHOD STARTED");
int age,ti;
double tax=0.0;
String g;
System.out.println("ENTER GENDER M FOR MALE AND F FOR FEMALE");
g=sc.next();
System.out.println("ENTER THE AGE ");
age=sc.nextInt();
System.out.println("ENTER THE TAX AMOUNT");
ti=sc.nextInt();
if(age<=65 && g.equals("M"))
{
	if(ti<=160000)
		tax=0.0;
	if(ti>160000.0 && ti<=500000.0)
		tax=((ti-160000)*10.0/100);
	if(ti>500000 && ti<=800000)
		tax=((ti-500000.0)*20.0/100.0)+34000.0;
if(ti>800000)
	tax=((ti-800000)*30.0/100.0)+94000.0;
System.out.println("TAX INCOME=RS"+ti);
System.out.println("INCOME TAX"+tax);
}
else
	System.out.println("WRONG CATEGORY");
System.out.println("NO CALCULATION OF INCOME TAX");
}
	}


