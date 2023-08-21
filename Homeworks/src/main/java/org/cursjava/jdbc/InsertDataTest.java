package org.cursjava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDataTest {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver"); 

            String jdbcUrl = "jdbc:postgresql://localhost:5432/your_database_name";
            String username = "your_username";
            String password = "your_password";

            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Insert data
            String insertAccommodationQuery = "INSERT INTO accommodation (type, bed_type, max_guests, description) VALUES (?, ?, ?, ?)";
            PreparedStatement accommodationStatement = connection.prepareStatement(insertAccommodationQuery);
            accommodationStatement.setString(1, "Single");
            accommodationStatement.setString(2, "Twin");
            accommodationStatement.setInt(3, 2);
            accommodationStatement.setString(4, "Cozy single room with twin beds");
            accommodationStatement.executeUpdate();
            accommodationStatement.close();



            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot load driver: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Cannot connect to the database: " + e.getMessage());
        }
    }
}
