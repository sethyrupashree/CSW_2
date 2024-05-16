class Animal {
    private String n;
    private String c;
    private String t;

    public Animal(String n, String c, String t) {
        this.n = n;
        this.c = c;
        this.t = t;
    }

    @Override
    public int hashCode() 
    {
        return (n.hashCode() * 81) + (c.hashCode() * 18) + t.hashCode();
    }

    public static void main(String[] args) {
       
        Animal d = new Animal("ron", "cream", "Pet");
        Animal t = new Animal("bob", "black", "pet");
        System.out.println("Hash code for " + d.n + ":" + d.hashCode());
        System.out.println("Hash code for " + t.n + ":" + t.hashCode());
    }
}