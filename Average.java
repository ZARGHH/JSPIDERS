package simple.java;
import java .util.Scanner;
public class Average {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the 3 subject marks");
int p,c,b;
p=sc.nextInt();
c=sc.nextInt();
b=sc.nextInt();
int sum; 
float avg=0.0f;

sum=p+c+b;
avg=sum/3;
System.out.println("the sum of the 3 subject is "+sum);
System.out.println("the average of the 3 subject is"+avg);
}

}
