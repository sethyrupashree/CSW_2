public class Coordinate {
    public static void main(String[] args) {

        point A = new point(78,48);
        point 	B = new point(A);
        System.out.println("("+A.getR()+","+A.getS()+")");
        B.setR(54);
        B.setS(8);
        System.out.println("("+B.getR()+","+B.getS()+")");
    }
}

class point{
    private double r;
    private double s;
    point(double r,double s){
        this.r = r;
        this.s = s;
    }

    public point(point p1) {
        System.out.println("Copy constructor");
        r = p1.r;
        s = p1.s;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }
}
