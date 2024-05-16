public class laptop_Main {
    public static void main(String[] args) {
        laptop lap = new laptop(null,0);
        lap.set_Model("lenovo");
        lap.set_Price(538930);
        System.out.println(lap.get_Model()+" "+lap.get_Price());
        System.out.println(lap);
    }
}
class laptop{
    private String m;
    private double p;
    laptop(String model,double price){
        this.m = model;
        this.p = price;
    }

    public String get_Model() {
        return m;
    }

    public void set_Model(String m) {
        this.m = m;
    }

    public double get_Price() {
        return p;
    }

    public void set_Price(double p) {
        this.p = p;
    }
    public String toString(){

        return p +" and  "+ m;
    }
}