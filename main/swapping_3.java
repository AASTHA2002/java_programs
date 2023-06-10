package main;

public class swapping_3 {
	public static void main(String args[]) {
		int a=10;
		int b=20;
		
	//using * / operator only applies if a and b are non zero
	System.out.println("before swapping"+a+" "+b);
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("after swapping"+a+" "+b);
	}
	

}
