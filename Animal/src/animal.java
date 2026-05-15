
public abstract class animal {
    public String Name;
    public int age;
    public String speak;

    // created constructor
    public animal(String Name, int age, String speak) {
        this.Name = Name;
        this.age = age;
        this.speak = speak;
    }

    // Getters og Setters
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }


    public String toString() {
        return "--- Dyre Info ---\n" +
                "Navn: " + Name + "\n" +
                "Alder: " + age + "\n" +
                "Lyd: " + speak;
    }

    public abstract void Speak(); // Ingen { }, kun et semikolon!
}