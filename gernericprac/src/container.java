public class container<T> {
    //declaring the variable type T
    private T value;

    //set the value of the value and it should match T
    //not a constructor but a method(because there is a "void")
    //if it was a constructor "public container(t value){this.value=value;}}

    public void setValue(T value){
        this.value = value;
    }

    //return the value
    public T getValue() {
        return value;

}
}
