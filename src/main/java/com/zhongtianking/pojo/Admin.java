package com.zhongtianking.pojo;

/**
 * @author xiaoyang
 * @Description 管理员信息bean
 * @create 2021-05-09 20:27
 */
public class Admin {
    //管理员id
    private int id;
    //管理员名字(若继承user类，可能需要删除)
    private String username;

    public Admin() {
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

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
