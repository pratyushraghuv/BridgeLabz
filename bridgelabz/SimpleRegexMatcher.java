import java.util.Scanner;

public class SimpleRegexMatcher {
    public static boolean match(String text, String pattern) {
        return matchHelper(text, pattern, 0, 0);
    }

    private static boolean matchHelper(String text, String pattern, int i, int j) {
        if (j == pattern.length()) return i == text.length();

        boolean firstMatch = (i < text.length() &&
                (text.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '.'));

        if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
            return matchHelper(text, pattern, i, j + 2) ||
                   (firstMatch && matchHelper(text, pattern, i + 1, j));
        } else if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '?') {
            return matchHelper(text, pattern, i, j + 2) ||
                   (firstMatch && matchHelper(text, pattern, i + 1, j + 2));
        } else {
            return firstMatch && matchHelper(text, pattern, i + 1, j + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter pattern: ");
        String pattern = sc.next();

        System.out.println("Match? " + match(text, pattern));
    }
}
