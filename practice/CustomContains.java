import java.util.Scanner;

public class CustomContains {
    public static boolean customContains(String text, String sub) {
        for (int i = 0; i <= text.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (text.charAt(i + j) != sub.charAt(j)) break;
            }
            if (j == sub.length()) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String text = sc.nextLine();
        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        System.out.println("Contains? " + customContains(text, sub));
    }
}
