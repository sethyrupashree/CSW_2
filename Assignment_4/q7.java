
class Student {
    String obj;

    public Student(String obj) {
        this.obj = obj;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(obj + " object is being garbage collected");
        super.finalize();
    }
}

public class q7 {
    public static void main(String[] args) {
        Student std = new Student("John");
        std = null; // Making the object eligible for garbage collection
        System.gc(); // Initiating garbage collection
    }
}
