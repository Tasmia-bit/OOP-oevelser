public class Book {
    private String title;
    private String author;

    //constructor
    public Book ( String title, String Author){
        this.title = title;
        this.author = Author;
    }

    @Override
    public String toString() {
        return " Title: " + title + " Author: " + author;
    }
}
