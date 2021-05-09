package com.zhongtianking.dao.impl;

import com.zhongtianking.dao.UserDao;
import com.zhongtianking.pojo.User;
import com.zhongtianking.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author xiaoyang
 * @Description
 * @create 2021-05-09 22:17
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsername(String username) {
        String sql = "select * from t_user where username = ?";
        Connection conn = null;
        try {
            conn = JDBCUtils.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return queryData(conn, User.class, sql, username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select * from t_user where username = ? and password = ?";
        Connection conn = null;
        try {
            conn = JDBCUtils.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return queryData(conn, User.class, sql, username, password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into t_user('username','password','level') values(?,?,?)";
        Connection conn = null;
        try {
            conn = JDBCUtils.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return update(conn, sql, user.getUsername(), user.getPassword(), user.getLevel());
    }
}
