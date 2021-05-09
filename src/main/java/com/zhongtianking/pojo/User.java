package com.zhongtianking.pojo;

/**
 * @author Xiaoyang
 * @Description 用户信息bean
 * @Date 21:31 2021/5/9
 **/

public class User {
    //用户id
    private int id;
    //用户名称
    private String username;
    //用户密码
    private String password;
    //用户等级
    private String level;

    public User() {

    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", level='" + level + '\'' +
                '}';
    }

    public User(int id, String username, String password, String level) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}


