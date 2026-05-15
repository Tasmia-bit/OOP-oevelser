public class Activity {

    //defines enum in my class
    enum Difficulty{
        BEGINNER, INTERMEDIATE, ADVANCED, ALL_LEVELS
    }
    public int activityId;
    public String nameActivity; //name of the activity- behøves ikke det bliver redudant data
    public int maxCapacity;
    public Difficulty difficulty;

    //empty constructor
    public Activity() {
    }
    //created a constructor
    public Activity(String nameActivity, int maxCapacity, Difficulty difficulty){
        this.nameActivity = nameActivity;
        this.maxCapacity = maxCapacity;
        this.difficulty = difficulty;

    }
    @Override
    public String toString() {
        return "\n activity: " + nameActivity + "\n max capacity: " + maxCapacity + "\n difficulty level: " + difficulty;
    }

    //method to know how many participant
    public int currentParticipants =0; //staring with zero

    public boolean isFull() {
        return currentParticipants >=maxCapacity;
    }

}
