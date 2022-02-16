package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @saundarya
 */
public class DBConnection {

    private Connection DBConnection;

    public Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Found!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Driver Not Found!");
            System.out.println("Driver Found!" + e);
            System.exit(0);
        }

        try {
            DBConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_man_sys?serverTimezone=UTC", "root", "siya.sql@0987");
            System.out.println("Database Connected!");
        } catch (Exception se) {
            JOptionPane.showMessageDialog(null, "Database Connection Failed!");
            System.out.println("Database Connection Failed!" + se);
            System.exit(0);
        }
        return DBConnection;
    }
}
