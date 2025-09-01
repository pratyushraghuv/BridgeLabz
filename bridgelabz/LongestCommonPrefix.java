import java.util.Scanner;

public class LongestCommonPrefix {
    public static String lcp(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter words separated by space: ");
        String[] words = sc.nextLine().split(" ");
        System.out.println("Longest Common Prefix: " + lcp(words));
    }
}
