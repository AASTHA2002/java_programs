package main;
import java.util.*;

public class sum_odd {
	public static void printsumOdd(int n) {
		int odd =0;
		for (int i=0;i<=n;i++) {
			if(i%2!=0) {
				odd=odd+i;
			}
			
				
		}
		System.out.println(odd);
	}
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		printsumOdd(n);
	}

}
