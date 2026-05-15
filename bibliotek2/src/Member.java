public class Member {
    private String NAME;
    private String id;

    public Member(String NAME,String id){
        this.NAME = NAME;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Name:" + NAME + "  id " + id;
    }
}
