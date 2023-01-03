package com.mounin.mybatis.mapper;

import com.mounin.mybatis.pojo.User;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Date: 2023/1/2 20:43
 * @Author: MOUNIN
 * @Description:
 **/
public interface UserMapper {

    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 根据id查询用户信息
     * @return
     */
    User getUserById();

    /**
     * 查询所有的用户信息
     * @return
     */
    List<User> getAllUser();
}
