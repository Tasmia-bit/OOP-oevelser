public class YogaActivity extends Activity {
    public String place;

    public YogaActivity(String nameActivity, int capacity,Difficulty difficulty, String place){
    super (nameActivity,capacity, Difficulty.BEGINNER);// from superclass
    this.place =place;

    }

    @Override
    public String toString() {
        // super.toString() it will bring the attributes from the super class and I add place attribute
        return super.toString() + "\n Place: " + place;
    }

}
