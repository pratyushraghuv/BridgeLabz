import java.util.Scanner;

public class StringPermutations {
    public static void permute(String s, String prefix) {
        if (s.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < s.length(); i++) {
                String rem = s.substring(0, i) + s.substring(i + 1);
                permute(rem, prefix + s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.next();
        System.out.println("Permutations:");
        permute(text, "");
    }
}
