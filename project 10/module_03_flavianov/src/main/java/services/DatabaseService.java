package main.java.services;

import com.sun.tools.javac.util.List;
import main.java.models.Partner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DatabaseService.java
public class DatabaseService {
    private static final String URL = "jdbc:postgresql://localhost:5432/partners_db";

    public List<Partner> getAllPartners() throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, "user", "pass")) {
            String sql = "SELECT * FROM partners";
            // Реализация запроса
        }
    }
}
