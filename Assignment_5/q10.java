
import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        while (true) {
            System.out.println("1. To lowercase\n2. To uppercase\n3. Search character\n4. Concatenate\n5. Exit");
                    System.out.print("Choose an operation: ");
            int option = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (option) {
                case 1:
                    System.out.println(string.toLowerCase());
                    break;
                case 2:
                    System.out.println(string.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter character to search for: ");
                    char ch = sc.nextLine().charAt(0);
                    System.out.println("First occurrence: " + string.indexOf(ch));
                    break;
                case 4:
                    System.out.print("Enter string to concatenate: ");
                    String concat = sc.nextLine();
                    string += concat;
                    System.out.println("New string: " + string);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
