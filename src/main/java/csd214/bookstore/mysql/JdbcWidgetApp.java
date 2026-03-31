package csd214.bookstore.mysql;

import java.sql.*;
import java.util.UUID;

public class JdbcWidgetApp {

    private static final String URL = "jdbc:mysql://localhost:3333/bookstore";
    private static final String USER = "csd214";
    private static final String PASS = "itstudies12345";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {

            createTable(conn);

            insertWidget(conn, UUID.randomUUID().toString(), "Super Widget", 19.99);

            listWidgets(conn);

            updateWidget(conn, "Super Widget", 25.50);

            deleteWidget(conn, "Super Widget");

            listWidgets(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS widgets (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "product_id VARCHAR(36)," +
                "widget_name VARCHAR(255)," +
                "price DOUBLE)";

        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
    }

    private static void insertWidget(Connection conn, String id, String name, double price) throws SQLException {
        String sql = "INSERT INTO widgets (product_id, widget_name, price) VALUES (?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setDouble(3, price);
            ps.executeUpdate();
        }
    }

    private static void listWidgets(Connection conn) throws SQLException {
        String sql = "SELECT * FROM widgets";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("=== Widgets ===");

            while (rs.next()) {
                System.out.printf("ID:%d | Name:%s | Price:%.2f%n",
                        rs.getInt("id"),
                        rs.getString("widget_name"),
                        rs.getDouble("price"));
            }
        }
    }

    private static void updateWidget(Connection conn, String name, double price) throws SQLException {
        String sql = "UPDATE widgets SET price = ? WHERE widget_name = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, price);
            ps.setString(2, name);
            ps.executeUpdate();
        }
    }

    private static void deleteWidget(Connection conn, String name) throws SQLException {
        String sql = "DELETE FROM widgets WHERE widget_name = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.executeUpdate();
        }
    }
}