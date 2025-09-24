import java.util.*;

public class CustomSplit {
    public static String[] customSplit(String s, char delimiter) {
        List<String> parts = new ArrayList<>();
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == delimiter) {
                parts.add(current);
                current = "";
            } else {
                current += ch;
            }
        }
        parts.add(current);
        return parts.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        System.out.print("Enter delimiter: ");
        char delimiter = sc.next().charAt(0);

        String[] result = customSplit(text, delimiter);
        System.out.println("Custom Split:");
        for (String word : result) {
            System.out.println(word);
        }
    }
}
