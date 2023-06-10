package main;
import java.util.*;

public class gcdFunctions {
	public static int gcd(int a, int b) {
		int gc=1;
		for(int i=1;i<=a&&i<=b;i++)
		{
			if(a%i==0&& b%i==0){
				 gc =i;
			}
				
				
			
		}
		return gc;
	
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gc =gcd(a,b);
		System.out.println(gc);
		
	}

}
