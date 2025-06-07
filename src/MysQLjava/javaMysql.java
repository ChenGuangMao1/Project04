package MysQLjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class javaMysql {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
//        String content1 = "hongmao";
        System.out.println("master");
        System.out.println("master222");
        System.out.println("master333");
        System.out.println("好了");
        System.out.println("好了");
        System.out.println("hot-fix111");
        int name = 20;
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        // 加载MySQL驱动
        Class.forName(driver);
        // 连接数据库
        Connection connection = DriverManager.getConnection(url, user, password);
        // 创建表
//        String sql ="insert into testcast values('javanew',20)"
        String sql1 = "select content, name from testcast where name = '" + name + "'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql1);  // 执行一次查询

        while (resultSet.next()) {
            String content2 = resultSet.getString(1);  // 获取第一个字段（content）
//            String name = resultSet.getString(2);     // 获取第二个字段（name）
            int name1 = resultSet.getInt(2);
            System.out.println("Content: " + content2);
            System.out.println("Name: " + name1);
        }

        // 关闭连接
        statement.close();
        connection.close();
        System.out.println("Success");
    }
}
