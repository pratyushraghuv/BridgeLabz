import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupWords(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter words separated by space: ");
        String[] words = sc.nextLine().split(" ");

        List<List<String>> groups = groupWords(words);
        System.out.println("Grouped Anagrams: " + groups);
    }
}
