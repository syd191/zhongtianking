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
    //用户邮箱
    private String email;
    //用户等级
    private int level;
    //经验值
    private int experience;
    //判断是否是管理员
    private int isAdmin;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", level=" + level +
                ", experience=" + experience +
                ", isAdmin=" + isAdmin +
                '}';
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public User() {

    }

}


