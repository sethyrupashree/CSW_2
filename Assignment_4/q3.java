
public class q3 {

    private String obj;

    public q3(String obj) {
        this.obj = obj;
    }

    public void finalize() {
        System.out.println("Object " + obj + " has been garbage collected.");
    }

    public static void main(String[] args) {
        q3 object = new q3("Example Object");

        object = null;

        System.gc();
    }
}
