class S2 {
    private String n;
    private String rn;
    private int tm;

    public S2(String n, String rn, int tm)
    {
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

    public static void bubbleSort(S2[] s) 
    {
        int n = s.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++) {
                if (s[j].get_RollNumber().compareTo(s[j + 1].get_RollNumber()) > 0)
                {
                    S2 temp = s[j];
                    s[j] = s[j + 1];
                     s[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        S2[] arr = new S2[5];
        arr[0] = new S2("rupa", "fbc3", 78);
        arr[1] = new S2("ashish", "cso6", 68);
        arr[2] = new S2("baisakhi", "dka9", 78);
        arr[3] = new S2("ayona", "jew82", 98);
        arr[4] = new S2("ayushi", "jefy8", 96);
        bubbleSort(arr);
        System.out.println("Sorted Student Details:");
        for (S2 student :arr) {
            System.out.println("Name: " + student.get_Name() +
                    ", Roll Number: " + student.get_RollNumber() +
                    ", Total Marks: " + student.get_TotalMarks());
        }
    }
}