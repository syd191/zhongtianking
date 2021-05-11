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
        String sql = "INSERT INTO t_user (username, password,email) VALUES (?,?,?)";
        Connection conn = null;
        try {
            conn = JDBCUtils.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return update(conn, sql, user.getUsername(), user.getPassword(), user.getEmail());
    }

    @Override
    public int becomeAdminByUsername(String username) {
        String sql ="UPDATE t_user SET isAdmin = '1' WHERE username = ?";
        Connection conn= null;
        try {
            conn = JDBCUtils.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return update(conn,sql,username);
    }

    @Override
    public int delectUserByUsername(String username) {
        String sql ="DELETE FROM t_user WHERE username = ?";
        Connection conn= null;
        try {
            conn = JDBCUtils.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return update(conn,sql,username);
    }

    @Override
    public int changeUserNameByUsername(String username,String newUsername) {

        String sql="UPDATE t_user SET username = ? WHERE username = ?";
        Connection conn= null;
        try {
            conn = JDBCUtils.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return update(conn,sql,newUsername,username);
    }

    @Override
    public int changePasswordByUsername(String username,String newPassword) {
        String sql="UPDATE t_user SET password = ? WHERE username = ?";
        Connection conn= null;
        try {
            conn = JDBCUtils.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return update(conn,sql,newPassword,username);
    }

    @Override
    public int changeEmailByUsername(String username, String newEmail) {
        String sql="UPDATE t_user SET email = ? WHERE username = ?";
        Connection conn= null;
        try {
            conn = JDBCUtils.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return update(conn,sql,newEmail,username);
    }

}
