
public class carTester {

    public static void main(String[] args) {
        car myCar1 = new car("Audi", "64rt");
        car myCar2 = new car(null, null);
        myCar2.setMake("aaa");
        myCar2.setModel("08y7");
        System.out.println(myCar1.getMake()+" "+myCar1.getModel());
        System.out.println(myCar2.getMake()+" "+myCar2.getModel());
    }
}
class car{

    private String m;
    private String md;
    car(String m,String md){
        this.m = m;
        this.md = md;
    }
   public void setMake(String m){
        this.m = m;
    }
  public  String getMake(){
        return m;
    }
  public  void setModel(String md){
        this.md = md;
    }
 public   String getModel(){
        return md;
    }
}