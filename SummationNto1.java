package simple.java;
import java.util.Scanner;

public class SummationNto1 
{
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number");
int n=sc.nextInt();
int sum=0;
for(int i=n;i>=1;i--)
sum=sum+i;
System.out.println(sum);
}

}
