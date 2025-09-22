package Day8_extras;
import java.util.Scanner;
public class level1 {
	public static String makeSubString(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }
    
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
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
 
        String sub1 = makeSubString(text, start, end);
        String sub2 = text.substring(start, end);

        boolean check = sameStrings(sub1, sub2);

        System.out.println("Substring with charAt(): " + sub1);
        System.out.println("Substring with substring(): " + sub2);
        System.out.println("Are both same? " + check);

        sc.close();
    }
}