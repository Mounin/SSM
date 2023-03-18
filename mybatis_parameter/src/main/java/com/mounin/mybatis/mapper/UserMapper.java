package com.mounin.mybatis.mapper;

import com.mounin.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @ClassName: UserMapper
 * @Date: 2023/1/14 20:03
 * @Author: MOUNIN
 * @Description:
 **/
public interface UserMapper {

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User getUserByUserName(String username);

    /**
     * 验证登录
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username, String password);

    /**
     * 验证登录(以map集合作为参数)
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String, Object> map);

    /**
     * 添加用户
     * @param user
     */
    void insertUser(User user);

    /**
     * 验证登陆（使用@param）
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
