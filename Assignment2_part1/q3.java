class Car {
    private String m;
    private String c;
    private double s;

    public Car(String m, String c, double s)
    {
        this.m = m;
        this.c = c;
        this.s = s;
    }

    public String get_Model() {
        return m;
    }

    public String get_Color() {
        return c;
    }

    public double get_Speed() {
        return s;
    }

    public boolean check_speed(Car otherCar) {
        return this.s > otherCar.s;
    }
}

public class q3{
    public static void main(String[] args) 
    {
        Car c1 = new Car("audi", "white", 37438.98);
        Car c2 = new Car("Hoonda", "black", 46949.98);

        // Compare car speeds
        if (c1.check_speed(c2)) {
            System.out.println(c1.get_Model() + " is faster than " + c2.get_Model());
            System.out.println("Details of the faster car:");
            System.out.println("Model: " + c1.get_Model());
            System.out.println("Color: " + c1.get_Color());
            System.out.println("Speed: " + c1.get_Speed());
        } 
        else
        {
            System.out.println(c2.get_Model() + " is faster than " + c1.get_Model());
            System.out.println("Details of the faster car:");
            System.out.println("Model: " + c2.get_Model());
            System.out.println("Color: " + c2.get_Color());
            System.out.println("Speed: " + c2.get_Speed());
        }
    }
}