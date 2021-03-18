package com.github.gudian1618.cgb2011yonghessm;

import com.github.gudian1618.cgb2011yonghessm.dao.DoorMapper;
import com.github.gudian1618.cgb2011yonghessm.pojo.Door;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/17 9:30 下午
 */

public class TestMybatis {

    private static SqlSession session = null;
    static {
        try {
            InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config2.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            session = factory.openSession(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindAll() {
        // 获取DoorMapper接口的子类实例
        DoorMapper mapper = session.getMapper(DoorMapper.class);
        // 查询所有门店信息
        List<Door> list = mapper.findAll();
        for (Door door : list) {
            System.out.println(door);
        }
    }

}
