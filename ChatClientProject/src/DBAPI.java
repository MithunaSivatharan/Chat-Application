/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LocalUserInstance
 */
public class DBAPI {
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/chatappdb", "root", "");
            System.out.println("Connected");
            return conn;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
