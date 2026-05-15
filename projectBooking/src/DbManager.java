import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

//utility class means it helps connecting other classes with db
public class DbManager {
    private static final String URL = "jdbc:mariadb://localhost:3306/mymariadbtest";
    private static final String USER = "root";
    private static final String PASS = "1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public static void saveMember(Member m) {
        // 1. SQL command template
        // use '?' as placeholders for the values we want to insert safely.
        String sql = "INSERT INTO members (Mname, age, email) VALUES (?, ?, ?)";

        // 2. Try-with-resources
        // Automatically closes the connection and statement even if an error occurs.
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // 3. Bind values to the placeholders (?)
            // We map data from the Member object 'm' to the SQL columns.
            pstmt.setString(1, m.Mname); // First '?' is for the name
            pstmt.setInt(2, m.age);      // Second '?' is for the age
            pstmt.setString(3, m.email); // Third '?' is for the email

            // 4. Execute the update
            // This sends the data to the MariaDB container.
            pstmt.executeUpdate();
            System.out.println("Success: Member saved to the database!");

        } catch (SQLException e) {
            // Catch errors like "Connection Refused" (if Docker is off) or SQL syntax errors.
            System.out.println("Error: Could not save the member.");
            e.printStackTrace();
        }
    }

    // 2. Save Activity
    public static void saveActivity(Activity a) {
        String sql = "INSERT INTO activities (name, capacity, difficulty) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // matching your Activity class variables: nameActivity, maxCapacity, difficulty
            pstmt.setString(1, a.nameActivity);
            pstmt.setInt(2, a.maxCapacity);
            pstmt.setString(3, a.difficulty.toString());

            pstmt.executeUpdate();
            System.out.println("Success: Activity saved to the database!");
        } catch (SQLException e) {
            System.out.println("Error: Could not save activity.");
            e.printStackTrace();
        }
    }

    // 3. Save Booking
    public static void saveBooking(Booking b) {
        // Storing names as references in the database
        String sql = "INSERT INTO bookings (member_name, activity_name) VALUES (?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // matching Booking class variables: name (Member object) and nameActivity (Activity object)
            pstmt.setString(1, b.name.Mname);
            pstmt.setString(2, b.nameActivity.nameActivity);

            pstmt.executeUpdate();
            System.out.println("Success: Booking saved to the database!");
        } catch (SQLException e) {
            System.out.println("Error: Could not save booking.");
            e.printStackTrace();
        }
    }

    //shows members in menu
    public static ArrayList<Member> getAllMembers() {
        ArrayList<Member> memberList = new ArrayList<>();
        String sql ="SELECT * FROM members";

        try ( Connection conn = getConnection();
              PreparedStatement pstmt = conn.prepareStatement(sql);
              ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Member m = new Member();
                //uses thee colum names from db
                m.Mname = rs.getString("Mname");
                m.age = rs.getInt("age");
                m.email = rs.getString("email");

                memberList.add(m);
            }
        }
        catch (SQLException e) {
            System.out.println("ERoor: could not fetch member. ");
            e.printStackTrace();
        }
        return memberList;

    }

    // shows activities
    public static ArrayList<Activity> getAllActivities(){
        ArrayList<Activity> activityList = new ArrayList<>();
        String sql ="SELECT * FROM activities";

        try ( Connection conn = getConnection();
              PreparedStatement pstmt = conn.prepareStatement(sql);
              ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()){
                Activity a = new Activity();
                // Mapping DB columns to Activity variables
                a.nameActivity = rs.getString("name");
                a.maxCapacity = rs.getInt("capacity");

                // Converting the String from DB back to the Enum type
                String diffString = rs.getString("difficulty");
                a.difficulty = Activity.Difficulty.valueOf(diffString);

                activityList.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Error: Could not fetch activities.");
            e.printStackTrace();
        }
        return activityList;

            }

    // shows all the booking

    // Method to fetch all bookings. It needs the lists of members and activities to "reconstruct" the objects
    public static ArrayList<Booking> getAllBookings(ArrayList<Member> members, ArrayList<Activity> activities) {
        ArrayList<Booking> bookingList = new ArrayList<>();
        String sql = "SELECT * FROM bookings";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                // 1. Get the names (Strings) from the database columns
                String memberName = rs.getString("member_name");
                String activityName = rs.getString("activity_name");

                // 2. Find the actual Member object that matches the name
                Member foundM = null;
                for (Member m : members) {
                    if (m.Mname.equalsIgnoreCase(memberName)) {//kan finde en match på trods af store små bogstaver
                        foundM = m;
                        break;
                    }
                }

                // 3. Find the actual Activity object that matches the name
                Activity foundA = null;
                for (Activity a : activities) {
                    if (a.nameActivity.equalsIgnoreCase(activityName)) {
                        foundA = a;
                        break;
                    }
                }

                // 4. If both were found, recreate the Booking object
                if (foundM != null && foundA != null) {
                    Booking b = new Booking(foundM, foundA);
                    bookingList.add(b);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: Could not fetch bookings.");
            e.printStackTrace();
        }
        return bookingList;
    }

    }

//overread og overload



