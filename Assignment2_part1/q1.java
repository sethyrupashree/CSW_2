class Student {
    private String n;
    private String rollNum;
    private int a;

    public Student(String n, String rollNum, int a) {
        this.n = n;
        this.rollNum = rollNum;
        this.a = a;
    }

    public void displayDetails() {
        System.out.println("name: " + n);
        System.out.println("roll Number: " + rollNum);
        System.out.println("age: " + a);
    }
}

public class q1 {
    public static void main(String[] args) {
        // Create a student object with an integer roll number
        Student s1 = new Student("rupashree", "9383", 20);
        s1.displayDetails();

        Student s2 = new Student("ashish", "uza729", 22);
        s2.displayDetails();
    }
}