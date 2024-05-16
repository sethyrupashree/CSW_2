
public class q4 {

    private String obj;

    public q4(String obj) {
        this.obj = obj;
    }

    public void finalize() {
        System.out.println("Object " + obj + " has been garbage collected.");
    }

    public static void main(String[] args) {
        // Creating an anonymous object
        new q4("Anonymous Object");

        System.gc();
    }
}
