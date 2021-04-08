package simple.java;
import java .util.Scanner;

public class Subject {
	static String getResult(int w,int x,int y,int z)
	{
		if(w<35||x<35||y<35||z<35)	
				
	return "FAIL";
		double per=(w+x+y+z)/4.0;
		
	if(per>=85)
		return "DISTINCTION";
		else if(per>=60)
			return "FIRST CLASS";
					
		else if(per>=50)
			return "SECOND CLASS";
		else
			return "PASS";
	}
	
	
	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("ent er the marks of 4 subject");
int p=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int m=sc.nextInt();
String res=getResult(p,c,m,b);
System.out.println("result is"+res);
	}

}
