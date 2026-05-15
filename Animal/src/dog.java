public class dog extends animal{
    boolean anotherAttribute;

    public dog (String Name,int age,String speak, Boolean anotherAttribute){
        super(Name, age, speak);
        this.anotherAttribute = anotherAttribute;
    }
    @Override
    public void Speak() {
        System.out.println(getName() + " siger: Wuf Wuf!");
    }


    public void fetch() {
        System.out.println(Name + " runs and says! Wuf!");
    }

}