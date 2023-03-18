package com.mounin.mybatis.mapper;

import com.mounin.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: SpecialSQLMapper
 * @Date: 2023/3/18 16:31
 * @Author: Honvin
 * @Description:
 **/
public interface SpecialSQLMapper {

    /**
     * 通过用户名模糊查询用户信息
     * @param mohu
     * @return
     */
    List<User> getUserByLike(@Param("mohu") String mohu);

    /**
     * 批量删除
     * @param ids
     */
    void deleteMoreUser(@Param("ids") String ids);

    /**
     * 动态设置表名
     * @param tableName
     * @return
     */
    List<User> getUserList(@Param("tableName") String tableName);

    /**
     * 添加user并获取自增的主键
     * @param user
     */
    void insertUser(User user);
}
