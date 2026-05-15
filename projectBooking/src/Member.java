public class Member {
    public int memberId;
    public String Mname;
    public int age;
    public String email;

    // empty constructor - in case 4 able to insert members
    public Member(){
    };
    //creat a constructor
    public Member(String Mname,int age,String email) {
        this.Mname = Mname;
        this.age = age;
        this.email= email;
    }

    @Override
    public String toString() {
        // this will be shown as in this method
        return  Mname + ",\n Age:" + age + ",\n Email: " + email + " ";
    }

}
