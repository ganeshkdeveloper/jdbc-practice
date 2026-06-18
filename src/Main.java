import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

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

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schooldb",
                "root",
                "root123"
            );

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                "SELECT * FROM students"
            );

            while(rs.next()){
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name")
                );
            }

            con.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}