package csd214.mysql;

import csd214.pojos.VideoGame;

import java.sql.*;

public class JdbcNicheWidgetApp {
    private static final String URL = "jdbc:mysql://localhost:3333/bookstore";
    private static final String USER = "csd214";
    private static final String PASS = "itstudies12345";
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            // 1. Create Table
            createTable(conn);
            // 2. Insert
            System.out.println("--- INSERTING ---");
            VideoGame g1 = new VideoGame("Call of Duty", "PS5", 69.99, 100) {
            };
            insertVideogame(conn, g1);
            // 3. Read
            System.out.println("--- READING ---");
            listWidgets(conn);
            // 4. Update
            System.out.println("--- UPDATING ---");
            updateWidgetPrice(conn, "Call of Duty", 25.50);

            // 5. Delete
            System.out.println("--- DELETING ---");
            deleteWidget(conn, "Call of Duty");
            listWidgets(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void createTable(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS video_Game (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "product_id VARCHAR(36), " +
                "name VARCHAR(255), " +
                "platform VARCHAR(255),"+
                "price DOUBLE)";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table 'widgets' ready.");
        }
    }
    private static void insertVideogame(Connection conn, VideoGame videoGame) throws SQLException {
        // SECURITY: Use ? to prevent SQL Injection
        String sql = "INSERT INTO video_Game (product_id, name, price, platform) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, videoGame.getProductId()); // UUID
            ps.setString(2, videoGame.getName());
            ps.setDouble(3, videoGame.getPrice());
            ps.setString(4, videoGame.getPlatform());
            ps.executeUpdate();
            System.out.println("Saved: " + videoGame.getName());
        }
    }
    private static void listWidgets(Connection conn) throws SQLException {
        String sql = "SELECT * FROM widgets";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.printf("ID: %d | UUID: %s | Name: %s | Price: $%.2f%n",
                        rs.getInt("id"),
                        rs.getString("product_id"),
                        rs.getString("widget_name"),
                        rs.getDouble("price"));
            }
        }
    }
    private static void updateWidgetPrice(Connection conn, String name, double newPrice) throws SQLException {
        String sql = "UPDATE widgets SET price = ? WHERE widget_name = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, newPrice);
            ps.setString(2, name);
            int rows = ps.executeUpdate();
            System.out.println("Updated " + rows + " widget(s).");
        }
    }

    private static void deleteWidget(Connection conn, String name) throws SQLException {
        String sql = "DELETE FROM widgets WHERE widget_name = ?";
        try(PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.executeUpdate();
            System.out.println("Deleted widget: " + name);
        }
    }
}
