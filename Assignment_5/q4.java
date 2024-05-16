
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

        while (true) {
            System.out.println("Current String: " + str);
            System.out.println("Choose an operation:");
            System.out.println("a. Add a substring at a specified position");
            System.out.println("b. Remove a range of characters from the string");
            System.out.println("c. Modify a character at a specified index");
            System.out.println("d. Concatenate another string at the end");
            System.out.println("e. Exit");

            char option = sc.nextLine().charAt(0);

            switch (option) {
                case 'a':
                    System.out.println("Enter the substring to add:");
                    String addStr = sc.nextLine();
                    System.out.println("Enter the position to add:");
                    int position = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    str.insert(position, addStr);
                    break;
                case 'b':
                    System.out.println("Enter the start index of the range to remove:");
                    int index = sc.nextInt();
                    System.out.println("Enter the end index of the range to remove:");
                    int endIndex = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    str.delete(index, endIndex);
                    break;
                case 'c':
                    System.out.println("Enter the index of the character to modify:");
                    int modifyInd = sc.nextInt();
                    System.out.println("Enter the new character:");
                    char newCh = sc.next().charAt(0);
                    sc.nextLine(); // Consume newline
                    str.setCharAt(modifyInd, newCh);
                    break;
                case 'd':
                    System.out.println("Enter the string to concatenate:");
                    String concat = sc.nextLine();
                    str.append(concat);
                    break;
                case 'e':
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }
}
