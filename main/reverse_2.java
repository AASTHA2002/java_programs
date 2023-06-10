package main;

import java.util.Scanner;

public class reverse_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		//using string buffer class method
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		rev=sb.reverse();
		System.out.println("reverse:"+rev);
		
		
	}

}
