import java.util.*;

public class q10{
    public static void main(String[] args) {
        String is = "Your large input string";

        Map<String, Integer> wf = new HashMap<>();

        String[] w = is.split("\\s+");
        // Iterate through each word
        for (String word : w) {
    
            String cw = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!cw.isEmpty()) {
                wf.put(cw, wf.getOrDefault(cw, 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(wf.entrySet());
        sorted.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int num = 2;
        for (int i = 0; i < Math.min(num, sorted.size()); i++) {
            System.out.println(sorted.get(i).getKey() + ": " + sorted.get(i).getValue());
        }
    }
}