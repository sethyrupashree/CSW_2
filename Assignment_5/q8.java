
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = sc.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = sc.nextLine();
        String concatenatedMethod = firstString.concat(secondString);
        String concatenatedString = firstString + secondString;
        System.out.println("Concatenated using method: " + concatenatedMethod);
        System.out.println("Concatenated using + operator: " + concatenatedString);
        System.out.print("Enter an index to retrieve character from concatenated string: ");
        int idx = sc.nextInt();
        if (idx >= 0 && idx < concatenatedString.length()) {
            System.out.println("Character at index " + idx + ": " +
                    concatenatedString.charAt(idx));
        } else {
            System.out.println("Index out of range.");
        }
    }
}
