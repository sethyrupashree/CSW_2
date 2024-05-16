
public class VehicleMain {
    public static void main(String[] args) {
        cars c1 = new cars();
        Bicycle b1 = new Bicycle();
        c1.accelerate();
        c1.brake();
        b1.accelerate();
        b1.brake();
        c1.accelerate(65);
        c1.accelerate(65,12);
        b1.accelerate(89);
        b1.accelerate(33,87);
    }
}
interface  Vehicle{
   public void accelerate();
  public  void brake();
}
class cars implements Vehicle{

    @Override
    public void accelerate() {

        System.out.println("Car is accelerating");
    }

    @Override
    public void brake() {

        System.out.println("Car applied break");
    }
    public void accelerate(double s){

        System.out.println("Car is accelerating atspeed:" + s );
    }
    public void accelerate(int s, int d) {
        System.out.println("Car is accelerating atspeed: " + s + " duration: " + d + " seC");
    }
}
class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking.");
    }

    // Method overloading
    public void accelerate(int s) {
        System.out.println("Bicycle is accelerating aTspeed: " + s);
    }

    public void accelerate(int s, int d) {
        System.out.println("Bicycle is accelerating atspeed: " + s + "duration: " + d + " sec");
    }
}