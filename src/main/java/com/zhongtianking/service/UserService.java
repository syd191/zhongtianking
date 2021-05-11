package com.zhongtianking.service;

import com.zhongtianking.pojo.User;

/**
 * @author xiaoyang
 * @Description
 * @create 2021-05-11 22:33
 */
public interface UserService {
    /**
     * @param user
     * @return void
     * @author Xiaoyang
     * @Description 注册用户
     * @Date 22:37 2021/5/11
     **/
    public void registUser(User user);

    /**
     * @param user
     * @return com.zhongtianking.pojo.User
     * @author Xiaoyang
     * @Description 用户登录
     * @Date 22:38 2021/5/11
     **/
    public User login(User user);

    /**
     * @param username
     * @return boolean
     * @author Xiaoyang
     * @Description 判断用户名是否存在
     * @Date 22:38 2021/5/11
     **/
    public boolean existsUsername(String username);
}
