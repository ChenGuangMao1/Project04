package com.hspedu.jdbc.myjdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbc01 {
    public static void main(String[] args) throws SQLException {
//        Driver driver = new Driver();
//        String url = "jdbc:mysql://localhost:3306/test";
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","1234");
        Connection connect = DriverManager.getConnection(url, properties);
        Statement statement = connect.createStatement();
//        Connection connect = driver.connect(url, properties);
        String spl = "insert into testcast values('happen',18)";
        String spl1 = "insert into testcast values('happen5',28)";
        int i = statement.executeUpdate(spl);
        System.out.println(i);
        statement.close();
        connect.close();

    }
}
