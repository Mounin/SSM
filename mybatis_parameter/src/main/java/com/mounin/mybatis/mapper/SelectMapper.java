package com.mounin.mybatis.mapper;

import com.mounin.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName: SelectMapper
 * @Date: 2023/3/18 15:34
 * @Author: Honvin
 * @Description:
 **/
public interface SelectMapper {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 查询所有的用户信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 获取总记录数
     * @return
     */
    Integer getCount();

    /**
     * 根据id查询用户信息并转化为Map集合
     * @param id
     * @return
     */
    Map<String, Objects> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有的用户信息并转化为Map集合
     * 若查询的数据有多条时，并且要将每一条数据转换为map集合
     * 此时有两种解决方案
     * @return
     */
//    List<Map<String, Objects>> getAllUserToMap();
    @MapKey("id")
    Map<String, Objects> getAllUserToMap();
}
