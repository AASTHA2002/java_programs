package main;

import java.util.*;

public class reverse_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		//using some algorithm
		int reverse =0;
		while(number!=0) {
			reverse=reverse*10+number%10;
			number=number/10;
			
		}
		
		System.out.println("reverse no is "+reverse);
		
		
	}

}
