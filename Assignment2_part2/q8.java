import java.util.HashMap;
import java.util.Map;

public class q8 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        Map<Character, Integer> charf = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            charf.put(ch, charf.getOrDefault(ch, 0) + 1);
        }

        boolean isAnagram = true;
        for (char ch : s2.toCharArray()) {
            if (!charf.containsKey(ch) || charf.get(ch) == 0) {
                isAnagram = false;
                break;
            }
            charf.put(ch, charf.get(ch) - 1);
        }

        if (isAnagram) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }
}
