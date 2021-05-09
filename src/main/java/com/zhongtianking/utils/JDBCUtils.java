package com.zhongtianking.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author xiaoyang
 * @Description jdbc工具包
 * @create 2021-05-07 19:00
 */
public class JDBCUtils {
    private static DataSource dataSource;

    static {
        try {
            Properties ps = new Properties();
            InputStream is =JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            ps.load(is);
            dataSource = DruidDataSourceFactory.createDataSource(ps);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/**
 * @author Xiaoyang
 * @Description 获取数据库连接
 * @Date 21:15 2021/5/9
 * @param

 * @return java.sql.Connection
**/

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
