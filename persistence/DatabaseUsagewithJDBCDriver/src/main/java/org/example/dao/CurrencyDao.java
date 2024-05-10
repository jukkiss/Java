package org.example.dao;

import model.Currency;
import datasource.MariaDbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrencyDao {
    public double getExchangeRate(String abbreviation) {
        String sql = "SELECT rateToUSD FROM currency WHERE abbreviation = ?";
        try (Connection conn = MariaDbConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, abbreviation);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getDouble("rateToUSD");
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
        return -1; // signify error condition
    }
}

