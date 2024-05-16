
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        StringBuffer buff = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Append \n2. Insert \n3. Delete \n4. Reverse \n5. Replace \n6. Exit");
            System.out.print("Choose an operation: ");
            int option = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (option) {
                case 1:
                    System.out.print("Enter string to append: ");
                    buff.append(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter index and string to insert: ");
                    int Index = sc.nextInt();
                    sc.nextLine();
                    buff.insert(Index, sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter start and end indices to delete: ");
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    buff.delete(start, end);
                    break;
                case 4:
                    buff.reverse();
                    break;
                case 5:
                    System.out.print("Enter start, end index, and replacement string: ");
                    start = sc.nextInt();
                    end = sc.nextInt();
                    sc.nextLine();
                    buff.replace(start, end, sc.nextLine());
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("Current Buffer: " + buff);
            System.out.println("Length: " + buff.length() + ", Capacity: " + buff.capacity());
        }
    }
}
