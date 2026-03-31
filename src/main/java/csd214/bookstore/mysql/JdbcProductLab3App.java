package csd214.bookstore.mysql;

import java.sql.*;

public class JdbcProductLab3App {

    private static final String URL = "jdbc:mysql://localhost:3333/bookstore";
    private static final String USER = "csd214";
    private static final String PASS = "itstudies12345";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {

            createTable(conn);

            insertBook(conn);
            insertTicket(conn);

            listProducts(conn);

            updatePrice(conn, 1, 60.0);

            deleteProduct(conn, 2);

            listProducts(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS products (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "product_type VARCHAR(50)," +
                "title VARCHAR(255)," +
                "author VARCHAR(255)," +
                "copies INT," +
                "description VARCHAR(255)," +
                "price DOUBLE)";

        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
    }

    private static void insertBook(Connection conn) throws SQLException {
        String sql = "INSERT INTO products (product_type, title, author, copies, price) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "BOOK");
            ps.setString(2, "Java Programming");
            ps.setString(3, "Kishan");
            ps.setInt(4, 10);
            ps.setDouble(5, 45.0);
            ps.executeUpdate();
        }
    }

    private static void insertTicket(Connection conn) throws SQLException {
        String sql = "INSERT INTO products (product_type, description, price) VALUES (?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "TICKET");
            ps.setString(2, "Movie Ticket");
            ps.setDouble(3, 20.0);
            ps.executeUpdate();
        }
    }

    private static void listProducts(Connection conn) throws SQLException {
        String sql = "SELECT * FROM products";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("=== PRODUCTS ===");

            while (rs.next()) {
                String type = rs.getString("product_type");

                if ("BOOK".equals(type)) {
                    System.out.printf("BOOK | %s | %s | %.2f | copies:%d%n",
                            rs.getString("title"),
                            rs.getString("author"),
                            rs.getDouble("price"),
                            rs.getInt("copies"));
                } else {
                    System.out.printf("TICKET | %s | %.2f%n",
                            rs.getString("description"),
                            rs.getDouble("price"));
                }
            }
        }
    }

    private static void updatePrice(Connection conn, int id, double price) throws SQLException {
        String sql = "UPDATE products SET price = ? WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, price);
            ps.setInt(2, id);
            ps.executeUpdate();
        }
    }

    private static void deleteProduct(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM products WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}