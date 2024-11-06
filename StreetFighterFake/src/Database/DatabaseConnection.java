package StreetFighterFake.src.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://167.71.83.102:3306/hechmgrxfq";
    private static final String USER = "hechmgrxfq";
    private static final String PASSWORD = "Eawd8BQTUX";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
