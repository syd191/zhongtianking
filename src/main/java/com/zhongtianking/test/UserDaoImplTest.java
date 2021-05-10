package com.zhongtianking.test;

import com.zhongtianking.dao.UserDao;
import com.zhongtianking.dao.impl.BaseDao;
import com.zhongtianking.dao.impl.UserDaoImpl;
import com.zhongtianking.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xiaoyang
 * @Description
 * @create 2021-05-10 9:52
 */
public class UserDaoImplTest {

    @Test
    public void queryUserByUsername() {
        UserDao dao=new UserDaoImpl();
        User admin = dao.queryUserByUsername("Admin");
        System.out.println(admin);

    }

    @Test
    public void queryUserByUsernameAndPassword() {
    }

    @Test
    public void saveUser() {
    }

    @Test
    public void becomeAdminById() {
    }

    @Test
    public void delectUserByUsername() {
    }

    @Test
    public void changeUserNameByUsername() {
    }

    @Test
    public void changePasswordByUsername() {
    }

    @Test
    public void changeEmailByUsername() {
    }
}