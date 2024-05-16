
public class q15 {
    public static void main(String[] args) {
        try {

            String s = "abc";
            int i;
            try {
                i = Integer.parseInt(s);
                int output = 10 / i;
                System.out.println("Result: " + output);
            } catch (ArithmeticException error) {
                System.err.println("Inner Catch Block: ArithmeticException - " + error.getMessage());
            }
        } catch (NumberFormatException error) {
            System.err.println("Outer Catch Block: NumberFormatException - " + error.getMessage());
        }
    }
}
