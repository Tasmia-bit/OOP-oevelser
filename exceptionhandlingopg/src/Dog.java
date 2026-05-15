public class Dog {
    private String name;
    private int age;


    //creating a constructorl
    public Dog(String name, int age){

        if ( name == null|| name.isEmpty()) {
            throw new IllegalArgumentException("you need fill out the name");//this message is going to be sent to try and catch if are some errors
        }

        if ( age < 0){
            throw new IllegalArgumentException(" age must be a positive number"); //this message is going to be sent to try and catch if are some errors
        }
        this.name = name;
        this.age = age;
    }
}
