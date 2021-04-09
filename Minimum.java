package simple.java;

public class Minimum {
	
	static int getMin(int a,int b)
	{
	if(a>b)
		return b;
	else 
		return a;
	}

	
	
	
	
	
	
	
	public static void main(String[] args) {
int a=11;
int b=7;
int c=getMin(a,b);
System.out.println("the minimum values is"+c);

	}

}
