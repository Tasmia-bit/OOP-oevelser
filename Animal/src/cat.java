public class cat extends animal {
    boolean anotherAttribute;

    public cat(String Name, int age, String speak, Boolean anotherAttribute) {
        super(Name, age, speak);
        this.anotherAttribute = anotherAttribute;
    }

    @Override
    public void Speak() {
        System.out.println(getName() + " this cat says miaw");
    }

    public void scratch() {
        System.out.println(getName() + " scratching the sofa! miaw!");
    }
}
