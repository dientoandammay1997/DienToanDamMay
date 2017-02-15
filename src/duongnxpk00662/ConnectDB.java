/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongnxpk00662;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DuongAli
 */
public class ConnectDB {

    String url = "jdbc:mysql://localhost:3306/db_dientoandammay";
    String user = "root";
    String password = "duongnguyen97";
    Connection conn;

    public ConnectDB() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Kết nối CSDL MySQL thành công!");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    private JFrame mainFrame;

    //Thực thi câu lệnh SELECT
    public ResultSet ExcuteQueryGetTable(String cauTruyVanSQL) {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(cauTruyVanSQL);
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(mainFrame, "Lỗi Thực Thi!\n" + ex.toString());
        }
        return null;
    }

    //Thực thi INSERT, DELETE, UPDATE
    public void ExcuteQueryUpdateDB(String cauTruyVanSQL) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(cauTruyVanSQL);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(mainFrame, "Lỗi Thực Thi!\n" + ex.toString());
        }
    }
}
