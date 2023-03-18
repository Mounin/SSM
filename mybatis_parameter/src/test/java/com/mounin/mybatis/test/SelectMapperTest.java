package com.mounin.mybatis.test;

import com.mounin.mybatis.mapper.SelectMapper;
import com.mounin.mybatis.pojo.User;
import com.mounin.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName: SelectMapperTest
 * @Date: 2023/3/18 15:36
 * @Author: Honvin
 * @Description:
 **/
public class SelectMapperTest {

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        // User{id=1, username='admin', password='admin', age=23, gender='男', email='123456@qq.com'}
    }

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
    }

    @Test
    public void testGetCount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println(count);
    }

    @Test
    public void testGetUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Objects> map = mapper.getUserByIdToMap(1);
        System.out.println(map);
        // {password=admin, gender=男, id=1, age=23, email=123456@qq.com, username=admin}
    }

    @Test
    public void testGetAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
//        List<Map<String, Objects>> list = mapper.getAllUserToMap();
//        System.out.println(list);
        // [{password=admin, gender=男, id=1, age=23, email=123456@qq.com, username=admin}, {password=123456, gender=女, id=2, age=33, email=321@qq.com, username=root}]

        Map<String, Objects> map = mapper.getAllUserToMap();
        System.out.println(map);
        /**
         * {
         *  1={password=admin, gender=男, id=1, age=23, email=123456@qq.com, username=admin},
         *  2={password=123456, gender=女, id=2, age=33, email=321@qq.com, username=root}
         * }
         */
    }
}
