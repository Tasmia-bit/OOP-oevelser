import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        //creating lists because the main should have
        //an overview of all books members and loan.
        ArrayList<Book>bookList = new ArrayList<>();
        ArrayList<Member>memberList = new ArrayList<>();
        ArrayList<loan>loanviewList = new ArrayList<>();

        //creating objects
        Book book1= new Book("Harry Potter", "J.K.Rowling");
        Book book2 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Member member1 = new Member ("Tasmia", "123456");
        Member member2 = new Member ("Rasmus", "123457");
        loan loan1 = new loan(book1,member1);

        // adding the object in the lists
          bookList.add(book2);
          bookList.add(book1);
          memberList.add(member1);
          memberList.add(member2);
          loanviewList.add(loan1);


        System.out.println(book1);
        System.out.println(member1);
        System.out.println(loan1);

        // to print out list of books,members and loans

        System.out.println("all books");
        for (Book b : bookList) {
            System.out.println(b);
        }
        System.out.println("\n--- All members---");
        for (Member m : memberList) {
            System.out.println(m);
        }

        System.out.println("\n--All loan---");
        for (loan l : loanviewList) {
            System.out.println(l);

        }
    }
        }