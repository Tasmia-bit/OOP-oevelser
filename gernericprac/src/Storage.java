import java.util.ArrayList;
import java.util.List;

public class Storage<T>{

    private ArrayList<T>items;

    //create my list with a type T
    public Storage(){
        this.items = new ArrayList<T>();

    }
    // a method that adds items
    public void add(T item){
        items.add(item);
    }
    //a method that shows all the items
    public ArrayList<T> getAll() {
        return items;
    }
}

