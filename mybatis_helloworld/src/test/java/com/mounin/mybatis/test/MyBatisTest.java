package com.mounin.mybatis.test;

import com.mounin.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName: MyBatisTest
 * @Date: 2023/1/2 20:52
 * @Author: MOUNIN
 * @Description:
 **/
public class MyBatisTest {

    @Test
    public void testInsert() throws IOException {
        // 1. 获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2. 获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 3. 获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 4. 获取sql的会话对象sqlSession，是MyBatis提供的操作数据库的对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 5. 获取UserMapper的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 6. 调用mapper接口中的方法，实现添加用户信息的功能
        int result = mapper.insertUser();
        System.out.println("结果是：" + result);
        // 7. 提交事务
        sqlSession.commit();
        // 8. 关闭事务
        sqlSession.close();
    }
}
