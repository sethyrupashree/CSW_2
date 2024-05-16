
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String string1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String string2 = sc.nextLine();
        String string1Lower = string1.toLowerCase();
        String string2Lower = string2.toLowerCase();
        System.out.println("Lowercase versions: " + string1Lower + ", " + string2Lower);
        System.out.println("Uppercase versions: " + string1.toUpperCase() + ", " +
                string2.toUpperCase());
        boolean IgnoringCase = string1Lower.equals(string2Lower);
        System.out.println("Are the two strings equal (case insensitive)? " +
                IgnoringCase);
    }
}
