package com.zhongtianking.dao.impl;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author xiaoyang
 * @create 2021-05-07 11:26
 */
public abstract class BaseDao {

    private static QueryRunner runner = new QueryRunner();

    /**
     * @param conn   连接
     * @param sql    sql语句
     * @param parpms 占位符列表
     * @return int 若为0则操作失败
     * @author Xiaoyang
     * @Description 数据库的增删改功能
     * @Date 16:30 2021/5/9
     **/
    public int update(Connection conn, String sql, Object... parpms) {
        try {
            return runner.update(conn, sql, parpms);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return 0;
    }


    /**
     * @param conn   连接
     * @param clazz  类
     * @param sql    sql语句
     * @param parpms 占位符列表
     * @return java.util.List<T> 返回查询结果列表
     * @author Xiaoyang
     * @Description 返回多个多个查询结果
     * @Date 16:28 2021/5/9
     **/
    public <T> List<T> queryDataList(Connection conn, Class<T> clazz, String sql, Object... parpms) {
        BeanListHandler<T> listHandler = new BeanListHandler<T>(clazz);
        List<T> queryList = null;
        try {
            queryList = runner.query(conn, sql, listHandler, parpms);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return queryList;
    }

    /**
     * @param conn   连接
     * @param clazz  类
     * @param sql    sql语句
     * @param parpms 占位符列表
     * @return T 返回单个查询结果
     * @author Xiaoyang
     * @Description 返回单个查询结果
     * @Date 16:25 2021/5/9
     **/
    public <T> T queryData(Connection conn, Class<T> clazz, String sql, Object... parpms) {
        BeanHandler<T> handler = new BeanHandler<T>(clazz);
        T t = null;
        try {
            t = runner.query(conn, sql, handler, parpms);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return t;
    }

    /**
     * @param conn   连接
     * @param clazz  类
     * @param sql    sql语句
     * @param parpms 占位符列表
     * @return T 返回单个特殊查询结果
     * @author Xiaoyang
     * @Description 特殊查询
     * @Date 16:46 2021/5/9
     **/
    public <T> T getValue(Connection conn, Class<T> clazz, String sql, Object... parpms) {
        T t = null;
        ScalarHandler<T> handler = new ScalarHandler<T>();
        try {
            t = runner.query(conn, sql, handler);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return t;
    }
}
