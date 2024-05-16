
public class q1 {
    private String obj;

    public q1(String obj) {
        this.obj = obj;
    }

    public void output() {
        new q1("InnerObject").result();
    }

    public void result() {
        new q1("InnerInnerObject");
    }
    
@Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + obj + " is being garbage collected.");
    }

    public static void main(String[] args) {
        new q1("MainObject").output();
        System.gc();
    }
}
