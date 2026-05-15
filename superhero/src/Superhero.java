public class Superhero {
    private String name;
    private String superPower;
    private int age;
    Boolean areHuman;
    String secretIdentity;
    int year;

    //cunstructoren is made here

    public Superhero(String name, String superPower,
                     int age, Boolean areHuman,
                     String secretIdentity, int year) {
        this.name = name;
        this.superPower = superPower;
        this.age = age;
        this.areHuman = areHuman;
        this.secretIdentity = secretIdentity;
        this.year = year;

    }
    //the print function

    public void PrintInfo(){
        System.out.println("--- SUPERHERO DOSSIER ---");
        System.out.println("Name: " + name);
        System.out.println("Superpower: " + superPower);
        System.out.println("age: " +  age);
        System.out.println("Is Human: " + areHuman);
        System.out.println("secret identity is: " +secretIdentity);
        System.out.println("year: " +  year);
        System.out.println("-------------------------");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
