public class Student{
    private int stdentId;
    private String firstName;
    private String lastName;
    public Student( int stdentId,String firstName,String lastName){
        this.stdentId=stdentId;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public int getstdentId(){
        return stdentId;
    }
    public void setstdentId(int stdentId){
      this.stdentId=stdentId;
    }
    public String getfirstName(){
        return firstName;
    }
    public void setfirstName(String firstName){
        this.firstName=firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public void setlastName(String lastName){
        this.lastName=lastName;
    }

}