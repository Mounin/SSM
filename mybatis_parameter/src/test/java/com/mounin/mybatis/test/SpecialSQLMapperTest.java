package com.mounin.mybatis.test;

import com.mounin.mybatis.mapper.SpecialSQLMapper;
import com.mounin.mybatis.pojo.User;
import com.mounin.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName: SpecialSQLMapperTest
 * @Date: 2023/3/18 16:38
 * @Author: Honvin
 * @Description:
 **/
public class SpecialSQLMapperTest {

    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserByLike("a");
        list.forEach(System.out::println);
    }
}
