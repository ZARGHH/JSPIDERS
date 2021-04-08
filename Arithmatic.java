package simple.java;
import java .util.Scanner;

public class Arithmatic {
static int zaimy( int w, int x)
{
	int z=w+x;
	return z;}
static int zaimy1(int w,int x) {
	int z=w-x;
	return z;
}
static int zaimy2(int w,int x) {
	int z=w*x;
	return z;

}
static int zaimy3(int w,int x) {
	int z=w/x;
	return z;}
static int zaimy4(int w,int x) {
	int z=w%x;
	return z;
}
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{

Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int p,q,r,s,t,u;
	p=zaimy(a,b);
	q=zaimy1(a,b);
	r=zaimy2(a,b);
	s=zaimy3(a,b);
	t=zaimy4(a,b);
	System.out.println("the addition answer is"+p);
	System.out.println("the substratction is"+q);
	System.out.println("the multiplication answer is"+r);
	System.out.println("the division answer is"+s);
	System.out.println("the modulus answer is"+t);
	
	
	
	
	}

}
