package com.example.demo.bean;
import lombok.Data;

@Data
public class User {
    private int id;
    private String UserName;
    private String Password;

    public User(int id, String UserName, String Password) {
        this.id=id;
        this.UserName = UserName;
        this.Password=Password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
