package com.mounin.mybatis.mapper;

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
}
