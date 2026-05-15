public class bird extends animal {
    boolean canfly;

    public bird(String Name, int age, String speak, Boolean canfly) {
        super(Name, age, speak);
        this.canfly = canfly;
    }

        // uniq method
        public void fly() {
        System.out.println(getName() + " basking with wings-flying!");

        }

        // implementing sound (called voice)
        @Override
        public void Speak() {
            System.out.println(getName() + " says: " + getSpeak() + "!");
        }
    }



