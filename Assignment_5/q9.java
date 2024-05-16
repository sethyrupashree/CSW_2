
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String line = sc.nextLine();
        System.out.print("Enter the word to replace: ");
        String replace = sc.next();
        System.out.print("Enter the replacement word: ");
        String replacingWord = sc.next();
        int idx = line.indexOf(replace);
        if (idx != -1) {
            String newLine = line.substring(0, idx) +
                    replacingWord +
                    line.substring(idx + replace.length());
            System.out.println("Original sentence: " + line);
            System.out.println("Modified sentence: " + newLine);
        } else {
            System.out.println("Word not found in the sentence.");
        }
    }
}
