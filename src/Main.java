// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.Statement;

// public class Main {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/schooldb",
//                 "root",
//                 "root123"
//             );

//             Statement st=con.createStatement();
//             st.executeUpdate( "INSERT INTO students VALUES(101,'Ganesh')");
//             System.out.println("Data Inserted Successfully!");

//             con.close();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }

// import java.sql.*;

// public class Main {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/schooldb",
//                 "root",
//                 "root123"
//             );

//             Statement st = con.createStatement();

//             ResultSet rs = st.executeQuery(
//                 "SELECT * FROM students"
//             );

//             while(rs.next()){
//                 System.out.println(
//                     rs.getInt("id") + " " +
//                     rs.getString("name")
//                 );
//             }

//             con.close();

//         } catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.Statement;

// public class Main {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/schooldb",
//                 "root",
//                 "root123"
//             );

//             Statement st = con.createStatement();

//             int rows = st.executeUpdate(
//                 "UPDATE students SET name='Java' WHERE id=101"
//             );

//             System.out.println(rows + " row updated");

//             con.close();

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.Statement;

// public class Main {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/schooldb",
//                 "root",
//                 "root123"
//             );

//             Statement st = con.createStatement();

//             int rows = st.executeUpdate(
//                 "DELETE FROM students WHERE id=101"
//             );

//             System.out.println(rows + " row deleted");

//             con.close();

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }

// import java.sql.Connection;
// import java.sql.DriverManager;

// public class Main {
//     public static void main(String[] args) {
//         try {

//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/schooldb",
//                 "root",
//                 "root123"
//             );

//             System.out.println("Connected Successfully");

//             con.close();

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.Statement;

// public class Main {
//     public static void main(String[] args) {
//         try {

//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/schooldb",
//                 "root",
//                 "root123"
//             );

//             Statement st = con.createStatement();

//             int rows = st.executeUpdate(
//                 "INSERT INTO students VALUES(101,'Ganesh')"
//             );

//             System.out.println(rows + " row inserted");

//             con.close();

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }

// import java.sql.*;

// public class Main {
//     public static void main(String[] args) {
//         try {

//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/schooldb",
//                 "root",
//                 "root123"
//             );

//             Statement st = con.createStatement();

//             ResultSet rs = st.executeQuery(
//                 "SELECT * FROM students"
//             );

//             while(rs.next()){
//                 System.out.println(
//                     rs.getInt("id") + " " +
//                     rs.getString("name")
//                 );
//             }

//             con.close();

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }
// import java.sql.*;

// public class Main {
//     public static void main(String[] args) {
//         try {

//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/schooldb",
//                 "root",
//                 "root123"
//             );

//             Statement st = con.createStatement();

//             int rows = st.executeUpdate(
//                 "UPDATE students SET name='Java' WHERE id=101"
//             );

//             System.out.println(rows + " row updated");

//             con.close();

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }
// import java.sql.*;

// public class Main {
//     public static void main(String[] args) {
//         try {

//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/schooldb",
//                 "root",
//                 "root123"
//             );

//             Statement st = con.createStatement();

//             int rows = st.executeUpdate(
//                 "DELETE FROM students WHERE id=101"
//             );

//             System.out.println(rows + " row deleted");

//             con.close();

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }
// import java.sql.*;

// public class Main {
//     public static void main(String[] args) {
//         try {

//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/schooldb",
//                 "root",
//                 "root123"
//             );

//             PreparedStatement ps = con.prepareStatement(
//                 "INSERT INTO students VALUES(?,?)"
//             );

//             ps.setInt(1, 101);
//             ps.setString(2, "Ganesh");

//             int rows = ps.executeUpdate();

//             System.out.println(rows + " row inserted");

//             con.close();

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }
// import java.sql.*;

// public class Main {
//     public static void main(String[] args) {
//         try {

//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/schooldb",
//                 "root",
//                 "root123"
//             );

//             PreparedStatement ps = con.prepareStatement(
//                 "SELECT * FROM students"
//             );

//             ResultSet rs = ps.executeQuery();

//             while(rs.next()){
//                 System.out.println(
//                     rs.getInt("id") + " " +
//                     rs.getString("name")
//                 );
//             }

//             con.close();

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }
// import java.sql.*;

// public class Main {
//     public static void main(String[] args) {
//         try {

//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/schooldb",
//                 "root",
//                 "root123"
//             );

//             PreparedStatement ps = con.prepareStatement(
//                 "UPDATE students SET name=? WHERE id=?"
//             );

//             ps.setString(1, "Java");
//             ps.setInt(2, 101);

//             int rows = ps.executeUpdate();

//             System.out.println(rows + " row updated");

//             con.close();

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }
// import java.sql.*;

// public class Main {
//     public static void main(String[] args) {
//         try {

//             Connection con = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/schooldb",
//                 "root",
//                 "root123"
//             );

//             PreparedStatement ps = con.prepareStatement(
//                 "DELETE FROM students WHERE id=?"
//             );

//             ps.setInt(1, 101);

//             int rows = ps.executeUpdate();

//             System.out.println(rows + " row deleted");

//             con.close();

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }