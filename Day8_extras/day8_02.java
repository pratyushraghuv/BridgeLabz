package Day8_extras;
import java.util.Scanner;
public class day8_02{  //String Palindrome Checker
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a string: ");
		String a = sc.nextLine();
		String b = "";
		for (int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if (a.equals(b)) {
			System.out.print("String "+ a +" is a palindrome");
		}
		else {
			System.out.print("String "+ a +" is not a palindrome");
		}
		sc.close();
	}
}