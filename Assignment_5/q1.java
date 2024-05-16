public class q1 {
    public static void main(String[] args) {
// Using String literals
        String r1 = "Java";
        String r2 = "Java";
// Using new keyword
        String r3 = new String("Java");
        String r4 = new String("Java");
// Memory and comparison
        System.out.println("r1 == r2 : " + (r1 == r2));
        System.out.println("r3 == r4 : " + (r3 == r4));
// Using equals method for content comparison
        System.out.println("r1.equals(r3) : " + r1.equals(r3)); // true, content is same
    }
}