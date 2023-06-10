package main;
import java.util.*;

public class fibonacciFunctions {
	public static void fibonacci(int n)
	{
		int f=0;
		int g=1;
		int temp;
		for(int i=0;i<=n;i++)
		{
			System.out.println(f);
			temp=f+g;
			f=g;
			g=temp;
			
		}
		
	}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	fibonacci(n);
	
}
}
