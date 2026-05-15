public class Booking {
    public int bookingId;
    public Member name;//kan kalder hele klassen ved at sige member member istedet for kun atribut fra member
    public Activity nameActivity;

    // empty constructor
    public Booking() {
    }
    //creating a constructor
    public Booking(Member name, Activity nameActivity){
       this.name = name;
       this.nameActivity= nameActivity;
    }
    @Override
    public String toString() {
        return "Member Name:" + name + " Activity" + nameActivity;
    }
}
