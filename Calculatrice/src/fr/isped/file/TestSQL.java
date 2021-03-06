package fr.isped.file;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSQL {
   static final String DB_URL = "jdbc:mysql://k-wa.re:3306/patient";
   static final String USER = "root";
   static final String PASS = "root";
   static final String QUERY = "SELECT * FROM etiologie ;";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);) {

         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.println("Test: " + rs.getString("id_etio"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}