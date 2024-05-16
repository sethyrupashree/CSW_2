 class Book {
        private int bId;
        private String bName;
        private double p;
    
        public Book(int bId, String bName, double p) {
            this.bId = bId;
            this.bName = bName;
            this.p = p;
        }
    
        public int get_BookId() {
            return bId;
        }
    
        public String get_BookName() {
            return bName;
        }
    
        public double get_Price() {
            return p;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Book other = (Book) obj;
            return Double.compare(other.p, p) == 0;
        }
    }
    
    public class q2 {
        public static void main(String[] args) {
            // Create two book objects
            Book b1 = new Book(167, "harry potter", 986.9);
            Book b2 = new Book(102, "java", 1782.9);
    
            if (b1.equals(b2)) {
                System.out.println("Both books have the same price.");
            } else {
                System.out.println("Books have different prices.");
            }
    
            System.out.println("Book1: id" + b1.get_BookId() + "name" + b1.get_BookName() + "Price" + b1.get_Price());
            System.out.println("Book2: id" + b2.get_BookId() + "name" + b2.get_BookName() + "Price" + b2.get_Price());
        }
    }
    