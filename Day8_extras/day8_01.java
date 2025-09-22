package Day8_extras;
import java.util.Scanner;
public class day8_01 { //fibo sequence generator
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: "); 
        int terms = sc.nextInt();
        
        int first = 0, second = 1;        
        System.out.print("Fibonacci Sequence: ");
        
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
	}
}