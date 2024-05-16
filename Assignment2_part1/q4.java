
class S1 {
    private String n;
    private String rn;
    private int tm;

    public S1(String n, String rn, int tm) {
        this.n = n;
        this.rn = rn;
        this.tm = tm;
    }

    public String get_Name() {
        return n;
    }

    public String get_RollNumber() {
        return rn;
    }

    public int get_TotalMarks() {
        return tm;
    }

    public static S1 linearSearch(S1[] s, String tRollNumber) {
        for (S1 student : s) {
            if (student.get_RollNumber().equals(tRollNumber)) {
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Create an array of student objects
        S1[] arr = new S1[3];
        arr[0] = new S1("rupashree", "ekwy", 75);
        arr[1] = new S1("ayushi", "smug", 92);
        arr[2] = new S1("ayona", "S7gr", 98);
        String tRollNumber = "S7gr";
        S1 found = linearSearch(arr, tRollNumber);

        if (found != null)
        {
            System.out.println("Student found:");
            System.out.println("Name " + found.get_Name());
            System.out.println("Roll Number " + found.get_RollNumber());
            System.out.println("Total Marks " + found.get_TotalMarks());
        } else {
            System.out.println("Student with roll number " + tRollNumber + " not found.");
        }
    }
}
