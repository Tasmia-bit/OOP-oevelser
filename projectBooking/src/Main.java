import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        // creating lists
        ArrayList<Member> memberList =DbManager.getAllMembers();
        ArrayList<Activity> activityList = DbManager.getAllActivities();
        ArrayList<Booking> bookingList =DbManager.getAllBookings(memberList,activityList);

        //scanner og control variable
        Scanner scanner = new Scanner(System.in);
        boolean running = true;


        //creating objects
      /*  Member member1 = new Member("Jens", 38, "jensemand@outlook.com");
        Activity activity1 = new Activity("yoga", 12, Activity.Difficulty.BEGINNER);
        YogaActivity activity2 = new YogaActivity("hotyoga",20, Activity.Difficulty.BEGINNER,"Gentofte");
        Booking booking1 = new Booking(member1, activity1);

        //adding the objects
        memberList.add(member1);
        activityList.add(activity1);
        activityList.add(activity2);
        bookingList.add(booking1);*/


        while (running) {
            System.out.println("\n--- welcome to the Booking ---");
            System.out.println("1. Show all bookings");
            System.out.println("2. show all members");
            System.out.println("3. Show all activities");
            System.out.println("4.Create a member");
            System.out.print("5.Create a activity");
            System.out.print("\n6.Create a booking");

            //the user's input
            int choice = scanner.nextInt();
            scanner.nextLine(); // "Scanner-fix"

            switch (choice) {
                case 1:
                    System.out.println("\n--- bookings ---");
                    for (Booking b : bookingList) {
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
                    System.out.println("\n--- Activity ---");
                    for (Activity a : activityList) {
                        System.out.println(a);
                    }
                    break;
                case 4:// creating a new member
                    System.out.println("--creating a member--");
                    System.out.print("Enter name:");
                    String newName = scanner.nextLine();//reading what the user writes

                    System.out.print("Enter the age: ");
                    String newAge = scanner.nextLine(); //string
                    int age = Integer.parseInt(newAge);// converting to int

                    System.out.println("Enter e-mail:");
                    String newEmail = scanner.nextLine();

                    // creating the obj in java
                    Member createdMember = new Member(newName, age, newEmail);
                    memberList.add(createdMember);
                    DbManager.saveMember(createdMember);
                    System.out.println("Member added to list and database!");

                    break;

                case 5:
                    System.out.println("--Create an activity--");

                    System.out.print("Insert name of the activity: ");
                    String actName = scanner.nextLine();

                    System.out.print("What is the max capacity of this activity? ");
                    int cap = Integer.parseInt(scanner.nextLine()); // Direct conversion to int

                    System.out.println("Select the difficulty (BEGINNER, INTERMEDIATE, ADVANCED, ALL_LEVELS)");
                    String newDifficulty = scanner.nextLine().toUpperCase();

                    // Convert the input string to the Difficulty Enum
                    Activity.Difficulty diff = Activity.Difficulty.valueOf(newDifficulty);//optimere diff fremover(det vague)

                    // 1. Create the Activity object
                    Activity createdActivity = new Activity(actName, cap, diff);

                    // 2. Add the object to the local list
                    activityList.add(createdActivity);

                    // 3. Save the object to the MariaDB database via the DbManager
                    DbManager.saveActivity(createdActivity);

                    System.out.println("Activity successfully added to list and database!");
                    break;

                case 6:
                    System.out.println("--Create a booking--");

                    // 1. Reading the inputs from the user
                    System.out.println("Enter member name");
                    String targetMember = scanner.nextLine();
                    System.out.println("I received: [" + targetMember + "]");

                    System.out.print("Enter activity name: ");
                    String targetActivity = scanner.nextLine();
                    System.out.println("I received: [" + targetActivity + "]");

                    // 2. Initializing search variables
                    Member foundMember = null;
                    Activity foundActivity = null;

                    // 3. Trying to match the member with the list of members
                    for (Member m : memberList) {
                        if (m.Mname.equalsIgnoreCase(targetMember)) {
                            foundMember = m;
                            break;
                        }
                    }

                    // 4. Trying to match the activity with the list of activities
                    for (Activity a : activityList) {
                        if (a.nameActivity.equalsIgnoreCase(targetActivity)) {
                            foundActivity = a;
                            break;
                        }
                    }

                    // 5. Checking if both the member and activity were found
                    if (foundMember != null && foundActivity != null) {

                        try {
                            // Check if the activity is full
                            if (foundActivity.currentParticipants >= foundActivity.maxCapacity) {
                                throw new Exception("The activity '" + foundActivity.nameActivity + "' is full!");
                            }

                            // 6. Creating the Booking object (using found objects)
                            Booking createdBooking = new Booking(foundMember, foundActivity);

                            // 7. Adding the booking to the local ArrayList
                            bookingList.add(createdBooking);

                            // 8. DATABASE SAVE: Saving the booking to MariaDB
                            DbManager.saveBooking(createdBooking);

                            // 9. Updating the participant count
                            foundActivity.currentParticipants++;

                            System.out.println("Booking is successfully created and saved to database!");

                        } catch (Exception e) {
                            // Catching error if the activity was full
                            System.out.println("ERROR: " + e.getMessage());
                        }

                    } else {
                        // Error message if member or activity was not in the lists
                        System.out.println("Error: Could not find the member or the activity");
                    }

                    break;

                        }
                    }

            }
            }





