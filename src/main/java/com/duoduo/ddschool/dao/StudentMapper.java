package com.duoduo.ddschool.dao;

import com.duoduo.ddschool.beans.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> selectList();
}
