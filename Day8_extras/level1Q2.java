package Day8_extras;
import java.util.*;
public class level1Q2 {
	public static boolean sameStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String first = sc.next();

        System.out.print("Enter second word: ");
        String second = sc.next();

        boolean check1 = sameStrings(first, second);
        boolean check2 = first.equals(second);

        System.out.println("Using charAt(): " + check1);
        System.out.println("Using equals(): " + check2);

        if (check1 == check2) {
            System.out.println("Both ways give SAME result.");
        } else {
            System.out.println("Both ways give DIFFERENT result.");
        }

        sc.close();
    }
}