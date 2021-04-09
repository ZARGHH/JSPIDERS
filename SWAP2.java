package simple.java;

public class SWAP2 {

	public static void main(String[] args) 
	{
 int a=76;
 int b=45;
  System.out.println("before swapping a is"+a+ "before swapping b is"+b);
	
	getswap(a,b);
	System.out.println(" the final answer of a is"+b+"b  after final swapping"+a);
	}

	
	
	static  void getswap(int a, int b)
	{
	int c=a;
	a=b;
	b=c;
	System.out.println("after swapping a is"+a+"after swapping is"+b);
	}
	
}
