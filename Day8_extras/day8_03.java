package Day8_extras;
import java.util.Scanner;

public class day8_03 { // Recursive function to calculate factorial  
    public static double factorial(int n) {
        if (n == 0 || n == 1) {  
            return 1;
        } else {
            return n * factorial(n - 1); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        double result = factorial(num);       
        System.out.println("Factorial of " + num + " is: " + result);
        sc.close();
    }
    
}