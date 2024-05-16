
public class q5 {
    private int intValue;
    private double doubleValue;

    public void initialize(int i, double d) {
        this.intValue = i;
        this.doubleValue = d;
    }

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();

        // Create objects
        q5 object1 = new q5();
        q5 object2 = new q5();

        // Initialize objects
        object1.initialize(10, 5.5);
        object2.initialize(20, 8.8);

        // Make objects unreachable
        object1 = null;
        object2 = null;

        // Request garbage collection
        System.gc();

        // Print memory usage
        long usedMem = rt.totalMemory() - rt.freeMemory();
        long totalMem = rt.totalMemory();
        System.out.println("Memory used: " + usedMem + " bytes");
        System.out.println("Total memory: " + totalMem + " bytes");
    }
}
