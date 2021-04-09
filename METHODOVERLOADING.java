package simple.java;

public class METHODOVERLOADING {

	public static void main(String[] args) 
	{
int a=65;
int b=78;
double c=7.5;
double d=8.9;
int result=getmin(a,b);
double result2=getmin(c,d);

System.out.println("minimum values for int is"+result);
System.out.println("minimum values for double is "+result2);
	}
	
	static  int getmin( int a,int b)	
	{
		int min;
		if(a>b)
		min=b;
		else 
		min=a;
		return min;
	}
	static double getmin( double c,double d)
	{
		double min;
		if(c>d)
		min=d;
		else 
		min=c;
		return min;
	}
	

	
	
	
	}


