package com.zhongtianking.service.impl;

import com.zhongtianking.dao.UserDao;
import com.zhongtianking.dao.impl.UserDaoImpl;
import com.zhongtianking.pojo.User;
import com.zhongtianking.service.UserService;

/**
 * @author xiaoyang
 * @Description
 * @create 2021-05-11 22:39
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        if (userDao.queryUserByUsername(username) != null) {
            return true;
        } else {
            return false;
        }
    }
}
