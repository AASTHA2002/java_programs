package main;
import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char button = sc.next().charAt(0);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        switch (button) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0)
                    System.out.println("Invalid expression");
                else
                    System.out.println(a / b);
                break;
            case '%':
                if (b == 0)
                    System.out.println("Invalid expression");
                else
                    System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid button");
        }
    }
}