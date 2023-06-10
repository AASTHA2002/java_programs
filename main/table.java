package main;
import java.util.*;

public class table {
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter the n you want the table of");
		int s;
		int a = in.nextInt();
		
		System.out.println("enter the last no ");
		int n= in.nextInt();
		for(int i=0;i<n;i++)
		{
			s=a*i;
			System.out.println(a+ "*" +i+"="+ s);
		}
	}

}
