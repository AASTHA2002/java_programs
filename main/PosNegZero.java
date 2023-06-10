package main;
import java.util.*;

public class PosNegZero {
	public static void main(String args[]) {
		int positive =0;
		int negative =0;
		int zero =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 to continue and 0 to stop");
		int input = sc.nextInt();
		while(input ==1) {
			
			
			System.out.println("enter your no");
			int number = sc.nextInt();
			if(number>0) {
				positive ++;
			}
			
			if(number<0) {
				negative ++;
			}
			
			if (number==0) {
				zero++;
			}
			
			
		
		System.out.println("enter 1 to continue 0 to stop");
		input =sc.nextInt();
		}
		System.out.println("Positive:" +positive);
		System.out.println("Negative:" +negative);
		System.out.println("zero:" +zero);
		
		
		
		
}
}
