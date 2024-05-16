
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        char[] chArr = string.toCharArray();
        System.out.print("Enter a character to search for: ");
        char searchChar1 = sc.next().charAt(0);
        int firstInd = string.indexOf(searchChar1);
        int lastInd = string.lastIndexOf(searchChar1);
        System.out.println("Character array: ");
        for (char c : chArr) {
            System.out.print(c + " ");
        }
        System.out.println("\nFirst occurrence of '" + searchChar1 + "': " + firstInd);
        System.out.println("Last occurrence of '" + searchChar1 + "': " + lastInd);
    }
}
