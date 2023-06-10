package main;

public class swapping_4 {
public static void main(String args[]) {
	//using bitwise XOR operator
	//bitwise convert number to binary equivalent and then performs xor operation
	int a=10;
	int b=20;
	
System.out.println("before swapping"+a+" "+b);
a=a^b;
b=a^b;
a=a^b;
System.out.println("after swapping"+a+" "+b);

}
}
