
public class q2 {
    private String obj;

    public q2(String obj) {
        this.obj = obj;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + obj + " is being garbage collected.");
    }

    public static void main(String[] args) {
        // Create two instances of ReassigningReference
        q2 object1 = new q2("Object 1");
        q2 object2 = new q2("Object 2");
        object1 = object2;

        System.gc();
    }
}
