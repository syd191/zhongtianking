package com.zhongtianking.test;

import com.zhongtianking.utils.JDBCUtils;
import org.apache.commons.dbutils.DbUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * @author xiaoyang
 * @create 2021-05-09 20:57
 */
public class JDBCUtilsTest {

    @Test
    public void getConnection() throws SQLException {
        Connection conn=JDBCUtils.getConnection();
        System.out.println(conn);
        System.out.println(conn.getTransactionIsolation());
        DbUtils.closeQuietly(conn);
    }

}