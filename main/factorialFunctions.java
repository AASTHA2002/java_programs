package main;
import java.util.*;

public class factorialFunctions {
    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Invalid number");
            return -1;
        }

        int fac = 1;
        for (int i = n; i >= 1; i--) {
            fac *= i;
        }

        System.out.println(fac);
        return fac;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac = factorial(n);
    }
}

