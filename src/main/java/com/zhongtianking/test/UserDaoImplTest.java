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
        UserDao dao = new UserDaoImpl();
        User admin = dao.queryUserByUsername("Admin");
        System.out.println(admin);

    }

    @Test
    public void queryUserByUsernameAndPassword() {
        UserDao dao = new UserDaoImpl();
        User admin = dao.queryUserByUsernameAndPassword("admin", "19121201");
        System.out.println(admin);
    }

    @Test
    public void saveUser() {
        UserDao dao = new UserDaoImpl();
        User user=new User("user1","123456","user1@zhongtianking.top",1,0,1);
        System.out.println(dao.saveUser(user));
    }

    @Test
    public void becomeAdminByUsername() {
        UserDao dao = new UserDaoImpl();
        System.out.println(dao.becomeAdminByUsername("user1"));
    }

    @Test
    public void delectUserByUsername() {
        UserDao dao = new UserDaoImpl();
        System.out.println(dao.delectUserByUsername("user1"));
    }
    @Test
    public void changeUserNameByUsername() {
        UserDao dao = new UserDaoImpl();
        System.out.println(dao.changeUserNameByUsername("Admin1@zhongtianking.top", "Admin1"));
    }

    @Test
    public void changePasswordByUsername() {
        UserDao dao = new UserDaoImpl();
        System.out.println(dao.changePasswordByUsername("Admin1", "Admin1"));
    }

    @Test
    public void changeEmailByUsername() {
        UserDao dao = new UserDaoImpl();
        System.out.println(dao.changeEmailByUsername("Admin1", "Admin1@zhongtianking.top"));
    }
}