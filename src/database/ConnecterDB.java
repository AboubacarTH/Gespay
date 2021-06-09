    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author wankoye
 */
public class ConnecterDB {
    private String url = "jdbc:mysql://localhost:3306/gespay";
    private String  username = "root";
    private String  password = "";
    public Connection connection;
      public ConnecterDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "connexion non etablie" +e.getMessage());
        }
    }
    public Connection getConnection(){
        return this.connection;
    }
    public static void main(String[] args){
        
    }
}
