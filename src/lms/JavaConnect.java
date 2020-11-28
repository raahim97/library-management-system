/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Raahim
 */
public class JavaConnect {
    Connection conn;
    public static Connection ConnectorDb(){
    try{
    Class.forName("org.sqlite.JDBC");
    Connection conn=DriverManager.getConnection("jdbc:sqlite:\\C:\\Users\\Raahim\\Documents\\NetBeansProjects\\Library Management System\\databases\\LMS.sqlite","root","root");
    return conn;
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
}
    
    }
}
