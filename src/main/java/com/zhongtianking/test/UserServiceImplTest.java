package com.zhongtianking.test;

import com.zhongtianking.pojo.User;
import com.zhongtianking.service.UserService;
import com.zhongtianking.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xiaoyang
 * @Description
 * @create 2021-05-11 22:46
 */
public class UserServiceImplTest {
    UserService userService = new UserServiceImpl();

    @Test
    public void registUser() {
        userService.registUser(new User("name1","psd1","email1@zhongtianking.top",1,10,0));
    }

    @Test
    public void login() {
        User user=new User();
        user.setUsername("name1");
        user.setPassword("psd1");
        System.out.println(userService.login(user));
    }

    @Test
    public void existsUsername() {
        System.out.println(userService.existsUsername("name1"));
    }
}