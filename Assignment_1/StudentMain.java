import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


interface EnrollmentSystem {
  public  void enrollStudent(Student s, Course c);
  public  void dropStudent(Student s, Course c);
   public void display_EnrollmentDetails();
}

class Student {
    private String sId;
    private String n;

    public Student(String sId, String n) {
        this.sId = sId;
        this.n = n;
    }

    public String get_StudentId() {
        return sId;
    }

    public String get_Name() {
        return n;
    }
}

// Course class
class Course {
    private String cId;
    private String n;
    private int maxCap;
    private List<Student> es;

    public Course(String cId, String n, int maxCap) {
        this.cId = cId;
        this.n = n;
        this.maxCap = maxCap;
        this.es = new ArrayList<>();
    }

    public String get_CourseId() {
        return cId;
    }

    public String get_Name() {
        return n;
    }

    public int get_MaxCapacity() {
        return maxCap;
    }

    public List<Student> get_EnrolledStudents() {
        return es;
    }

    public boolean enrollStudent(Student student) {
        if (es.size() < maxCap) {
            es.add(student);
            return true;
        }
        return false;
    }

    public void dropStudent(Student s) {
        es.remove(s);
    }
}

// Enrollment class
class Enrollment implements EnrollmentSystem {
    private Map<Course, List<Student>> enrollments;

    public Enrollment() {
        enrollments = new HashMap<>();
    }

    @Override
    public void enrollStudent(Student s, Course c) {
        if (!enrollments.containsKey(c)) {
            enrollments.put(c, new ArrayList<>());
        }
        List<Student> s1 = enrollments.get(c);
        if (c.enrollStudent(s)) {
            s1.add(s);
            System.out.println(s.get_Name() + " enrolled in " + c.get_Name());
        } else {
            System.out.println("Course " + c.get_Name() + " is fullEnrollment failed for " + s.get_Name());
        }
    }

    @Override
    public void dropStudent(Student s, Course c) {
        if (enrollments.containsKey(c)) {
            List<Student> students = enrollments.get(c);
            if (students.contains(s)) {
                c.dropStudent(s);
                students.remove(s);
                System.out.println(s.get_Name() + " dropped from " + c.get_Name());
            } else {
                System.out.println(s.get_Name() + " is not enrolled in " + c.get_Name());
            }
        } else {
            System.out.println("No enrollment record found for " + c.get_Name());
        }
    }

    @Override
    public void display_EnrollmentDetails() {
        for (Map.Entry<Course, List<Student>> entry : enrollments.entrySet()) {
            Course course = entry.getKey();
            List<Student> students = entry.getValue();
            System.out.println("Course: " + course.get_Name() + ", Enrolled Students: ");
            for (Student student : students) {
                System.out.println("- " + student.get_Name());
            }
        }
    }
}

// Main class
public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("7467", "rup");
        Student s2 = new Student("9372", "ayushi");

        Course c1 = new Course("csw2", " Computer Science", 990);
        Course c2 = new Course("ala", "ala_783", 985);

        EnrollmentSystem e = new Enrollment();
        e.enrollStudent(s1, c1);
        e.enrollStudent(s2, c1);

        e.enrollStudent(s1, c2);
        e.enrollStudent(s2, c2);

        e.display_EnrollmentDetails();

        e.dropStudent(s1, c1);
        e.dropStudent(s2, c2);

        e.display_EnrollmentDetails();
    }
}