import java.util.Scanner;

public class ValidShuffle {
    public static boolean isShuffle(String a, String b, String c) {
        if (a.length() + b.length() != c.length()) return false;
        int i = 0, j = 0, k = 0;
        while (k < c.length()) {
            if (i < a.length() && a.charAt(i) == c.charAt(k)) {
                i++;
            } else if (j < b.length() && b.charAt(j) == c.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.next();
        System.out.print("Enter second string: ");
        String b = sc.next();
        System.out.print("Enter shuffle string: ");
        String c = sc.next();

        System.out.println("Valid shuffle? " + isShuffle(a, b, c));
    }
}
