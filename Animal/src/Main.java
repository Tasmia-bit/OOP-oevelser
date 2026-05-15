
public class Main {
    public static void main(String[] args) {

        System.out.println("hej");

        // creating objects
        dog minHund = new dog("Fido", 3, "Wuf", true);
        cat minKat = new cat("NEO", 5, "Miaw", true);
        bird minbird = new bird("kakadue", 2, "tudeloo", true);

        // calling the methods
        minHund.Speak();
        minKat.Speak();
        minKat.scratch();
        minHund.fetch();
        minbird.fly();

        // Test din toString
        System.out.println(minKat);

    }
}