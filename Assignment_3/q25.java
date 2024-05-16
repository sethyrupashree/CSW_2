
import java.util.InputMismatchException;
import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = readInteger(sc);
        System.out.println("You entered: " + num);
    }

    public static int readInteger(Scanner sc) {
        int num;
        while (true) {
            try {
                num = sc.nextInt();
                break; // Break the loop if input is successfully parsed as an integer
            } catch (InputMismatchException error) {
                System.out.println("Invalid input. Please enter an integer:");
                sc.next(); // Consume invalid input
            }
        }
        return num;
    }
}
