package dao;

import static dao.UserDAO.openConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import model.Categorry;
import java.sql.*;
import java.util.ArrayList;


public class CategoryDAO {
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
    
    public static boolean save (Categorry category) {
        try (Connection c = openConnection()) {
            String insert = "INSERT INTO USERS(name) VALUES (?)";
            PreparedStatement ps = c.prepareStatement(insert);
            ps.setString(1, category.getName());
            int row = ps.executeUpdate();
            return row >= 1;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public static ArrayList<Categorry> getAllRecords() {
        ArrayList<Categorry> arr = new ArrayList<>();
        try (Connection c = openConnection()) {
            String select = "SELECT * FROM CATEGORY ?";
            PreparedStatement ps = c.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                arr.add(new Categorry(rs.getInt("id"), rs.getString("name")));
            }
          
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return arr;
    }
    
     public static boolean delete (Categorry category) {
        try (Connection c = openConnection()) {
           String delete = "DELETE  FROM CATEGORY WHERE id = ?";
            PreparedStatement ps = c.prepareStatement(delete);
            ps.setInt(1, category.getId());
            int row = ps.executeUpdate();
            return row >= 1;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
