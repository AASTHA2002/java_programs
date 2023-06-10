package main;
import java.util.*;

public class cube {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			double a = Math.pow(i, 3);
			System.out.println(a);
			
		}
	}
	

}
