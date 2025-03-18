package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.User;

public class UserDAO {

    public static Connection openConnection() {
        Connection conn = null;
        try {
            System.out.println("Hello from DBConfig.driver " + DBConfig.driver);
            Class.forName(DBConfig.driver);
            conn = DriverManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);
            System.out.println("connected successfully");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }
    public static User handleLogin(String username, String password) {
        String query = "SELECT * FROM users WHERE name = ? AND password = ?";
        try (Connection c = openConnection(); PreparedStatement ps = c.prepareStatement(query)) {

            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new User(
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("mobileNumber"),
                            rs.getString("address"),
                            rs.getString("password")
                    );
                }
            }
        } catch (Exception ex) {
            System.err.println("Error during login: " + ex.getMessage());
            ex.printStackTrace(); 
        }
        return null; 
    }
    public static boolean insertUser(User user) {
        try (Connection c = openConnection()) {
            String insert = "INSERT INTO USERS(name, email, mobileNumber, address, password) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = c.prepareStatement(insert);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getMobileNumber());
            ps.setString(4, user.getAddress());
            ps.setString(5, user.getPassword());
            int row = ps.executeUpdate();
            return row >= 1;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public static boolean isExistUsername(String name) {
        try (Connection c = openConnection()) {
            String select = "SELECT * FROM USERS WHERE name = ?";
            PreparedStatement ps = c.prepareStatement(select);
            ps.setString(1, name);  // Safely set the parameter to avoid SQL injection
            ResultSet rs = ps.executeQuery();
            return rs.next();  // Returns true if a record is found
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;  // Return false in case of failure
    }


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con = openConnection();
    }
}
