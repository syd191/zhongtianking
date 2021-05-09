package com.zhongtianking.dao;

import com.zhongtianking.pojo.User;

/**
 * @author xiaoyang
 * @Description
 * @create 2021-05-09 22:01
 */
public interface UserDao {
    /**
     * @param username 需要查询的用户名
     * @return com.zhongtianking.pojo.User，如果为null则没有这个用户
     * @author Xiaoyang
     * @Description 根据用户名返回用户信息
     * @Date 22:04 2021/5/9
     **/
    public User queryUserByUsername(String username);

    /**
     * @param username 要查询的用户名
     * @param password 要查询的用户密码
     * @return com.zhongtianking.pojo.User 如果为null则为用户名或密码错误
     * @author Xiaoyang
     * @Description 根据用户名和用户密码查询返回用户信息
     * @Date 22:09 2021/5/9
     **/
    public User queryUserByUsernameAndPassword(String username, String password);

    /**
     * @param user 需要保存的用户名
     * @return com.zhongtianking.pojo.User 如果返回0，则保存失败
     * @author Xiaoyang
     * @Description 保存用户信息
     * @Date 22:06 2021/5/9
     **/
    public int saveUser(User user);

}
