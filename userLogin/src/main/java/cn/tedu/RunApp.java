package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class RunApp {
    static Connection connection;
    public static void Connect_mysql(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://139.196.229.74:3306/Li?characterEncoding=utf8&serverTimezone=UTC&useSSL=false&rewriteBatchedStatements=true";
            String username="Li";
            String password="123456";
            connection= DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void Update_sql(String sql) {

    }

    public void Dele_sql(String sql) {

    }

    public void Insert_sql(String sql) {

    }

    public ResultSet Select_sql(String sql, String username, String password) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            return preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Connect_mysql();
        SpringApplication.run(RunApp.class,args);
    }
}
