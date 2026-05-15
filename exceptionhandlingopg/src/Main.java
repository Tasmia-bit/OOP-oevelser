import static java.lang.Integer.parseInt;
public class Main {
    /*public static void main (String[] args){
        String[]names ={"Anna","Bob"};

        try {
            System.out.println(names[2]);//the program vil crash due to no index 2
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("you are trying to get an index that does not exist");
        }
        System.out.println("program slut");
    }
}*/
//opgave2
 /*   public static void main (String[] args){
            String text = null;
            try {
                System.out.println(text.length());
            }
            catch (NullPointerException e){
                System.out.println(" error the length is null");
            }
        try {
            int number = Integer.parseInt("hej");//fordi parse er det risikabelt kode derfor kommer det indunder try.
                System.out.println(number);
            }
            catch(Exception e){
                System.out.println(" you are trying to print number but is a string");
            }

            finally {
                System.out.println("try-catch is done -the program is shutting down now");
            }

        }
    }*/

    public static void main (String[] args) {

        try {
            Dog mydog = new Dog("neo", 2);
            System.out.println("dog1 er printet ud her");

            Dog mydog2 = new Dog("Lullu", -3);
            System.out.println("dog2 bliver printet her");
        }
        catch (IllegalArgumentException e) {
            System.out.println("You have an erro for one of the dogs");
            System.out.println("The error: " + e.getMessage());
        }

        }
    }
//because there is an error the e.getMessage()) gets the error from if else statement(throw) in the Dog class.

