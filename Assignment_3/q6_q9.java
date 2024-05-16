
import java.util.Scanner;

public class q6_q9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 6: Handle NumberFormatException
        try {
            System.out.println("Enter a number: ");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("Number entered: " + num);
        } catch (NumberFormatException error) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        // Task 7: Convert string input to integer
        try {
            System.out.println("Enter a number: ");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException error) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        // Task 8: Find square root of integer numbers
        try {
            System.out.println("Enter an integer number: ");
            int num = Integer.parseInt(sc.nextLine());
            double sqrt = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + sqrt);
        } catch (NumberFormatException | ArithmeticException error) {
            System.out.println("Invalid input or cannot calculate square root of negative numbers.");
        }

        // Task 9: Divide two numbers input by the user
        try {
            System.out.println("Enter the dividend: ");
            int div = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the divisor: ");
            int dvsr = Integer.parseInt(sc.nextLine());
            double output = (double) div / dvsr;
            System.out.println("Result of division: " + output);
        } catch (NumberFormatException | ArithmeticException error) {
            System.out.println("Invalid input or cannot divide by zero.");
        }

        sc.close();
    }
}
