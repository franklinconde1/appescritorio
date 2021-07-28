package com.basiliscoderoko.appescritorio;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionMysql {

    public static void main(String[] args) {
      
        Statement stmt;
        ResultSet rs;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionMysql.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            stmt = getConnection().createStatement();
            //stmt.executeUpdate("INSERT INTO dreamgifts.comuna VALUES (1,'Provi', 1)");
            rs = stmt.executeQuery("SELECT * FROM dreamgifts.comuna WHERE COM_ID_COMUNA = 1");
            rs.next();
            do {
                System.out.println(rs.getString("COM_ID_COMUNA") + " Nombre: " + rs.getString("COM_NOMBRE"));
            } while (rs.next());

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionMysql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/dreamgifts?serverTimezone=America/Santiago";
            String username = "root";
            String password = "";
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
