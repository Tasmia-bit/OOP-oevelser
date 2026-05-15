
public class Main {
    public static void main(String[] args) {
        // we choose the type T to be a string
       /* container <String> textBox = new container<>();//defines the class to be a string
        textBox.setValue("Hej verden");
        String s = textBox.getValue(); // no type-casting necessary!
        System.out.println("String value: " + s);

        // we choose the type T to be an Integer
        container<Integer> numberBox = new container<>();// defines the class to be an Integer
        numberBox.setValue(42);
        Integer i = numberBox.getValue();
        System.out.println("Integer value: " + i);
        */
        //testing for storage

        Storage<String>names = new Storage<>();
        names.add("Anna");
        names.add("Peter");
        System.out.println(names.getAll());
    }
}