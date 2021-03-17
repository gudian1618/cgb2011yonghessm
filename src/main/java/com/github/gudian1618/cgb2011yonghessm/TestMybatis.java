package com.github.gudian1618.cgb2011yonghessm;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/17 9:30 下午
 */

public class TestMybatis {

    private static SqlSession session = null;
    static {
        try {
            InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            session = factory.openSession(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindAll() {

    }

}
