package org.cursjava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.net.URLEncoder;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver"); // Load the PostgreSQL driver

            Connection connection = null;
            DriverManager.setLoginTimeout(60); // Optional: Set a login timeout

            try {
                String encodedPassword = URLEncoder.encode("password", "UTF-8");
                String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=" + encodedPassword;

                connection = DriverManager.getConnection(url);

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM accommodation");

                while (resultSet.next()) {
                    System.out.println("\nRoom ID: " + resultSet.getInt("id") +
                            "\nRoom type: " + resultSet.getString("type") +
                            "\nBed type: " + resultSet.getString("bed_type") +
                            "\nGuests number: " + resultSet.getString("max_guests") +
                            "\nDescription: " + resultSet.getString("description"));
                }

                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                System.err.println("Cannot connect to the database: " + e.getMessage());
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Cannot load driver: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
