import java.util.Scanner;

public class CustomReplace {
    public static String customReplace(String text, char oldChar, char newChar) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result += (ch == oldChar) ? newChar : ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();
        System.out.print("Enter char to replace: ");
        char oldChar = sc.next().charAt(0);
        System.out.print("Enter new char: ");
        char newChar = sc.next().charAt(0);

        System.out.println("Result: " + customReplace(text, oldChar, newChar));
    }
}
