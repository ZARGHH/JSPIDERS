package simple.java;
import java.util.Scanner;
	 
	public class ZARGHAM 
	{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int matrix [][]=new int[m][n];
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++) {
		matrix[i][j]=sc.nextInt();
		System.out.println(matrix[i][j]);
	}
}
	}
	}