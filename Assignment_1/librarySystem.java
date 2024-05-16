public class librarySystem {
    public static void main(String[] args) {
    
        Book b = new Book("oops", "xyz", 8937);
        Magazine m = new Magazine("dsa", "abc", "nov 12");
        DVD dvd = new DVD("harry potter", "nba", 9748);

        b.display_Details();
        System.out.println();
        m.display_Details();
        System.out.println();
        dvd.display_Details();
    }
}


abstract class LibraryResource {
    private String t;
    private String a;

    LibraryResource(String t, String a) {
        this.t = t;
        this.a = a;
    }

    public String get_Title() {
        return t;
    }

    public void set_Title(String t) {
        this.t = t;
    }

    public String ge_tAuthor() {
        return a;
    }

    public void set_Author(String a) {
        this.a = a;
    }

    public abstract void display_Details();
}


class Book extends LibraryResource {
    private int pCount;

    public Book(String t, String a, int pCount) {
        super(t, a);
        this.pCount = pCount;
    }

    public int get_PageCount() {
        return pCount;
    }

    public void set_PageCount(int pCount) {
        this.pCount = pCount;
    }

    @Override
    public void display_Details() {
        System.out.println("book title: " + get_Title());
        System.out.println("author: " + ge_tAuthor());
        System.out.println("page count: " + get_PageCount());
    }
}


class Magazine extends LibraryResource {
    private String iDate;

    public Magazine(String t, String a, String iDate) {
        super(t, a);
        this.iDate = iDate;
    }

    public String get_IssueDate() {
        return iDate;
    }

    public void setIssueDate(String iDate) {
        this.iDate = iDate;
    }

    @Override
    public void display_Details() {
        System.out.println("magazine title: " + get_Title());
        System.out.println("author: " + ge_tAuthor());
        System.out.println("issue date: " + get_IssueDate());
    }
}

class DVD extends LibraryResource {
    private int d;

    public DVD(String title, String author, int d) {
        super(title, author);
        this.d = d;
    }

    public int get_Duration() {
        return d;
    }

    public void set_Duration(int duration) {
        this.d= duration;
    }

    @Override
    public void display_Details() {
        System.out.println("DVD Title: " + get_Title());
        System.out.println("Author: " + ge_tAuthor());
        System.out.println("Duration: " + get_Duration() + " min");
    }
}