package database;

import java.sql.*;

public class MyFirstJdbcConnection {

    public static void main(String[] args) {

        String connectionURL = "jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;databaseName=AdventureWorks;user=mrumian;password=***";


        try(Connection con = DriverManager.getConnection(connectionURL);
            Statement stmt = con.createStatement()) {

            String SQL = "SELECT TOP 10 * FROM Person.Contact";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()){
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }
            System.out.println("...........................");
        } catch(SQLException e) {
            System.out.println("Błąd! Wiadomość: " + e.getMessage() + "Status: " + e.getSQLState());
        }






























    }
}
