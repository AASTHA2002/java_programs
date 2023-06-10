package main;
import java.util.*;

public class powerFunctions {
	public static double power(double x,double n) {
		double s =Math.pow(x, n);
		System.out.println(s);
		return s;
	}
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		double x =sc.nextDouble();
		double n =sc.nextDouble();
		power(x,n);
		
		
	}

}
