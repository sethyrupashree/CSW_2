
public class q28 {
    public static void main(String[] args) {
        try {
            recursive(1);
        } catch (StackOverflowError error) {
            System.out.println("Caught StackOverflowError: " + error.getMessage());
        }
    }

    public static void recursive(int num) {
        System.out.println("Current value of i: " + num);
        recursive(num + 1);
    }
}
