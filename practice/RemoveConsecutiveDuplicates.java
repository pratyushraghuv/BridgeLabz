import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static String removeDuplicates(String s) {
        if (s.length() == 0) return "";
        String result = "" + s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.next();
        System.out.println("After removing duplicates: " + removeDuplicates(text));
    }
}
