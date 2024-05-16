public class collegeMain__q3 {
	 public static void main(String[] args) {
	        college c1 = new college("Iter","Jagamara");
	        college c2 = new college("Kiit","Patia");
	        student1 s1 = new student1(c1.getCollegeName(), c1.getCollegeLoc(), "9787568","rupashree");
	        student1 s2 = new student1(c2.getCollegeName(), c2.getCollegeLoc(), "12787568","Ayushi");
	        s1.display();
	        s2.display();
	    }
	}
	class college{
	    private String cName;
	    private String cLoc;
	    college(String cName,String cLoc){
	        this.cName = cName;
	        this.cLoc = cLoc;
	    }

	    public String getCollegeName() {
	        return cName;
	    }

	    public void setCollegeName(String cName) {
	        this.cName = cName;
	    }

	    public String getCollegeLoc() {
	        return cLoc;
	    }

	    public void setCollegeLoc(String cLoc) {
	        this.cLoc = cLoc;
	    }
	}
	class student1 extends college{
	    private String sId;
	    private String sName;
	    student1(String cName, String cLoc,String sId,String sName) {
	        super(cName, cLoc);
	        this.sId = sId;
	        this.sName = sName;
	    }

	    public String getStudentId() {
	        return sId;
	    }

	    public void setStudentId(String sId) {
	        this.sId = sId;
	    }

	    public String getStudentName() {
	        return sName;
	    }

	    public void setStudentName(String sName) {
	        this.sName = sName;
	    }
	    void display(){
	        System.out.println(super.getCollegeName()+" "+super.getCollegeLoc()+" "+sId+" "+sName);
	    }
}