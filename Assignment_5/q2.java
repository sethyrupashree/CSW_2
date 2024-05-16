
public class q2 {
    public static void main(String[] args) {
        String string = "Hello";
        System.out.println("Original String: " + string);
// Trying to modify using concat
        string.concat(" World");
        System.out.println("After concat: " + string); // Remains "Hello" due to immutability
// Correct way to concatenate
        string = string.concat(" World");
        System.out.println("After correct concat: " + string);
// Using as CharSequence
        CharSequence cseq = "Immutable";
        System.out.println("Char at 3 in CharSequence: " + cseq.charAt(3)); // 'm'
    }
}
