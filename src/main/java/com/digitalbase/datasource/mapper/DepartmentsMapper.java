package com.digitalbase.datasource.mapper;

import com.digitalbase.datasource.beans.Departments;
import com.digitalbase.datasource.beans.DepartmentsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbggenerated
     */
    int countByExample(DepartmentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbggenerated
     */
    int deleteByExample(DepartmentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String deptNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbggenerated
     */
    int insert(Departments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbggenerated
     */
    int insertSelective(Departments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbggenerated
     */
    List<Departments> selectByExample(DepartmentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbggenerated
     */
    Departments selectByPrimaryKey(String deptNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Departments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Departments record);
}