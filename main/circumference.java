package main;
import java.util.*;

public class circumference {
	public static double retcircumference(double radius) {
		double c =2*3.14*radius;
		System.out.println(c);
		return c;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double radius =sc.nextDouble();
		 retcircumference(radius);
		
	}
	
	

}
