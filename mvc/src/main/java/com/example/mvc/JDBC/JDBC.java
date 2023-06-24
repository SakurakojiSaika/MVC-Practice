package com.example.mvc.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void JDBCTest () throws Exception{
        String url = "jdbc:mysql://localhost:8888/mysql";
        String user = "root";
        String password = "123456";

        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        Class.forName("com.mysql.cj.jdbc.Driver");

        conn = DriverManager.getConnection(url,user,password);

        stat = conn.createStatement();

        rs = stat.executeQuery("SELECT * FROM documents");

        while(rs.next()){
            int id = rs.getInt("id");
            String content = rs.getString("content");
            System.out.println("Id:" + id + ", content:" + content);

        }
    }
}
