
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //creating lists because the main should have
        //an overview of all books members and loan.
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Member> memberList = new ArrayList<>();
        ArrayList<loan> loanViewList = new ArrayList<>();

        // Scanner og control variable
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        //creating objects
        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        Book book2 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Book book3 = new Book("10 min og 38 sek","ELif Shafaq");
        Member member1 = new Member("Tasmia", "123456");
        Member member2 = new Member("Rasmus", "123457");
        Member member3 = new Member("SOPHIA", "1234e43");
        loan loan1 = new loan(book1, member1);

        // adding the object in the lists
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        memberList.add(member1);
        memberList.add(member2);
        memberList.add(member3);

        loanViewList.add(loan1);

        // start while-menu
        while (running) {
            System.out.println("\n--- welcome to the library ---");
            System.out.println("1. Show all books");
            System.out.println("2. Show all members");
            System.out.println("3. Show loans");
            System.out.println("4.Create a book");
            System.out.print("5.Create a member" );
            System.out.print("\n6.Create a loan");


            int choice = scanner.nextInt();
            scanner.nextLine(); // "Scanner-fix"

            switch (choice) {
                case 1:
                    System.out.println("\n--- books ---");
                    for (Book b : bookList) {
                        System.out.println(b);
                    }
                    break;
                case 2:
                    System.out.println("\n--- Members ---");
                    for (Member m : memberList) {
                        System.out.println(m);
                    }
                    break;
                case 3:
                    System.out.println("\n--- Loan ---");
                    for (loan l : loanViewList) {
                        System.out.println(l);
                    }
                    break;

                case 4: // creating a new book
                    System.out.println("\n--- create new book ---");

                    System.out.print("Insert title: ");
                    String newTitle = scanner.nextLine(); // reading what the user writes

                    System.out.print("Insert Author: ");
                    String newAuthor = scanner.nextLine(); // reading the author

                    // creating an object and putting it in a list
                    bookList.add(new Book(newTitle, newAuthor));

                    System.out.println("The book '" + newTitle + "'is saved!");
                    break;

                case 5:
                    System.out.println("\n --Create a member--");

                    System.out.println( "Insert name");
                    String newName = scanner.nextLine();//reading the input of the user

                    System.out.println( "Insert id");
                    String newId = scanner.nextLine();//reading the input of the user

                    memberList.add(new Member(newName, newId));

                    System.out.println("Name " + newName + "and the id is saved");
                    break;

                case 6:
                   System.out.println("\n --create new loan--");

                   // choose a book
                    System.out.println("select a book by number");
                   //creating a loop to go through the list
                     for( int i = 0; i < bookList.size(); i++){
                         System.out.println(i + "." + bookList.get(i).toString());}

                     System.out.println("Enter a book number");

                    System.out.println("Select a member by number");
                     //creating a loop to go through memberlist
                     for ( int i = 0; i < memberList.size(); i++){
                         System.out.println(i + "."+ memberList.get(i).toString());
                         }
                     int bookChoice = scanner.nextInt();
                     Book selectedBook = bookList.get(bookChoice);

                     //
                     int memberChoice =scanner.nextInt();
                     Member selectedMember = memberList.get(memberChoice);
                    //
                    scanner.nextLine();

                    //creating the new loan
                    loan newLoan = new loan (selectedBook,selectedMember);
                    loanViewList.add(newLoan);

                    System.out.println("\nSuccess! Loan registered:");
                     System.out.println("Loan registered: " + selectedBook + "\n is now with " + selectedMember);
                     break;

                case 0:
                    running = false;
                    System.out.println("shutting down...");
                    break;
                default:
                    System.out.println("error choose again");
            }
        }
        scanner.close();
    }
}