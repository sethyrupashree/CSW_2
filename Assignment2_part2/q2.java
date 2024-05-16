import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User {
    private String n;
    private int a;

    public User(String n, int a) {
        this.n= n;
        this.a = a;
    }
    public String get_Name() {
        return n;
    }
    public void set_Name(String n) {
        this.n = n;
    }
    public int get_Age() {
        return a;
    }

    public void set_Age(int a) {
        this.a= a;
    }
}

class ArrayList_User {
    public static void main(String[] args) {
        List<User> ulist = new ArrayList<>();

        // Add User objects
        ulist.add(new User("ayushi", 20));
        ulist.add(new User("rupa", 20));
        ulist.add(new User("ayona", 19));
        for (User u : ulist) {
            System.out.println("Name: " + u.get_Name() + ", Age: " + u.get_Age());
        }
        Collections.sort(ulist, Comparator.comparingInt(User::get_Age));
        System.out.println("Sorted Users by Age:");
        for (User u : ulist) {
            System.out.println("Name: " + u.get_Name() + "Age: " + u.get_Age());
        }
    }
}