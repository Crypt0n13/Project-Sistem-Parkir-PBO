/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.parkir;


import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
private static Connection koneksi;
public static Connection getKoneksi() {
    if(koneksi==null) {
        try{
            String url;
            url="jdbc:mysql://localhost:3306/sistem_parkir";
            String username = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url,username,password);
            
        } catch (SQLException t) {
            JOptionPane.showMessageDialog(null, "error koneksi");
            
        }
    } return koneksi;
}static Object getConnection(){
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

