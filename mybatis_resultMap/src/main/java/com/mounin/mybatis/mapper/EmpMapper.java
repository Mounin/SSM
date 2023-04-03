package com.mounin.mybatis.mapper;

import com.mounin.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: EmpMapper
 * @Date: 2023/4/3 20:34
 * @Author: Honvin
 * @Description:
 **/
public interface EmpMapper {

    /**
     * 根据empId查询emp信息
     * @param empId
     * @return
     */
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    /**
     * 获取员工以及对应的部门信息
     * @param empId
     * @return
     */
    Emp getEmpAndDept(@Param("empId") Integer empId);
}
