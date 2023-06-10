package main;

import java.util.Scanner;

public class greaterofTwo {
	public static int greater(int a,int b) {
		if(a>b)
			{
			System.out.println(a);
			return a;
		
			}
		else
		{
			System.out.println(b);
			return b;
		}
			}
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b=sc.nextInt();
		greater(a,b);
	}

}
