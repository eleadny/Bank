package cn.tedu.loginController;

import cn.tedu.RunApp;
import cn.tedu.pojo.Personpojo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
@RequestMapping("index")
public class Login_zhuce {
    @RequestMapping("login")
    public String login_in(Personpojo personpojo) throws SQLException {
        String username = personpojo.getUsername();
        String password = personpojo.getPassword();
        RunApp runApp = new RunApp();
        String s = "SELECT name,password FROM UserLogin WHERE name=? or password=?";
        ResultSet resultSet = runApp.Select_sql(s,username,password);
        while (resultSet.next()){
            if(resultSet.getString("name")==null){
                return "用户不存在";
            }else if(!resultSet.getString("name").equals(username) || !resultSet.getString("password").equals(password)){
                return "http://127.0.0.1:8081";
            }else{
                return "欢迎";
            }
        }
        return "用户数据异常";
    }
}
