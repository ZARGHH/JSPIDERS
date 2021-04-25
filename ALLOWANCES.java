package simple.java;
import java.util.Scanner;
public class ALLOWANCES {

	public static void main(String[] args) 
	{
		System.out.println("MAIN METHOD STARTED");
	Scanner sc=new Scanner(System.in);
	System.out.println(" ENTER THE NAME OF THE EMPLOYEE AND SALARY");
	double da,hra,pf,np=0,gp=0;

	String name=sc.next();
	int ba=sc.nextInt();
	 da=ba*25/100.0;
	 hra=ba*15/100.0;
	pf=ba*8.33/100.0;
	np=ba+da+hra;
	gp=np-pf;
	System.out.println("name of the employee"+name);
	System.out.println(name+"gross salary is"+gp);
	System.out.println(name+"net pay is"+np);
	System.out.println("MAIN METHOD ENDED");
	 }

}
