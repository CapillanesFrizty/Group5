 package badiangfinalproject;

import java.sql.*;

public class databaseConnector {
      Connection con;
      Statement mystate;
      ResultSet rs, rs2;
      PreparedStatement PrepState;
     
     public void connect(){
         String url = "jdbc:mysql://localhost:3325/gym?zeroDateTimeBehavior=CONVERT_TO_NULL";
         String user ="root";
         String pass = "";
         
         try {
             con = DriverManager.getConnection(url, user, pass);
             mystate =con.createStatement();
         } catch (SQLException e) {
         }
     }
}
