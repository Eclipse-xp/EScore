package com.xp.EScore.dao;

import org.apache.ibatis.annotations.Param;

import com.xp.EScore.po.Student;

public interface StudentMapper {

    Student selectById(@Param("studentId") String studentId);

}
