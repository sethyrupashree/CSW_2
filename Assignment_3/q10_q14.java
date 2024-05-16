
import java.lang.Math;

public class q10_q14 {
    public static double calcExp1(double r) {
        if (Math.abs(r - Math.PI / 2) < 0.0001 || Math.abs(r + Math.PI / 2) < 0.0001) {
            return Double.NaN; // Avoid division by zero
        }
        return (Math.sin(r) + Math.cos(r)) / Math.tan(r);
    }

    public static double calcExp2(double r) {
        if (Math.abs(Math.tan(r) - 1.0 / Math.tan(r)) < 0.0001) {
            return Double.NaN; // Avoid division by zero
        }
        try {
            double output = Math.log(Math.sin(r) + Math.cos(r)) / (Math.tan(r) - 1.0 / Math.tan(r));
            if (Double.isNaN(output) || Double.isInfinite(output)) {
                throw new ArithmeticException("Invalid mathematical operation");
            }
            return output;
        } catch (ArithmeticException error) {
            System.err.println("Error: " + error.getMessage());
            return Double.NaN;
        }
    }

    public static double calcExp3(double r) {
        if (Math.abs(Math.tan(r) + 1) < 0.0001) {
            return Double.NaN; // Avoid division by zero
        }
        try {
            double in = Math.sin(r) * Math.cos(r);
            if (in < 0) {
                throw new ArithmeticException("Negative value inside square root");
            }
            double output = Math.sqrt(in) / (Math.tan(r) + 1);
            if (Double.isNaN(output) || Double.isInfinite(output)) {
                throw new ArithmeticException("Invalid mathematical operation");
            }
            return output;
        } catch (ArithmeticException error) {
            System.err.println("Error: " + error.getMessage());
            return Double.NaN;
        }
    }

    public static double calcExp4(double r) {
        if (Math.abs(Math.sin(r) + Math.cos(r)) < 0.0001) {
            return Double.NaN; // Avoid division by zero
        }
        return (Math.sin(r) * Math.cos(r)) / (Math.sin(r) + Math.cos(r));
    }

    public static double calcExp5(double r) {
        if (Math.abs(Math.tan(r) - 1.0 / Math.tan(r)) < 0.0001) {
            return Double.NaN; // Avoid division by zero
        }
        try {
            double in = Math.abs(Math.sin(r) + Math.cos(r));
            if (in <= 0) {
                throw new ArithmeticException("Non-positive value inside logarithm");
            }
            double output = Math.log(in) / (Math.tan(r) - 1.0 / Math.tan(r));
            if (Double.isNaN(output) || Double.isInfinite(output)) {
                throw new ArithmeticException("Invalid mathematical operation");
            }
            return output;
        } catch (ArithmeticException error) {
            System.err.println("Error: " + error.getMessage());
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        double r = Math.PI / 4; // Example value of x

        // Test each expression
        System.out.println("Expression 1 result: " + calcExp1(r));
        System.out.println("Expression 2 result: " + calcExp2(r));
        System.out.println("Expression 3 result: " + calcExp3(r));
        System.out.println("Expression 4 result: " + calcExp4(r));
        System.out.println("Expression 5 result: " + calcExp5(r));
    }
}
