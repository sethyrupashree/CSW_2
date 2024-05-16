
class CustomException extends Exception {
    public CustomException(String msg) {
        super(msg);
    }
}
public class q22 {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom checked exception.");
        } catch (CustomException error) {
            System.err.println("CustomCheckedException caught: " + error.getMessage());
        }
    }
}
