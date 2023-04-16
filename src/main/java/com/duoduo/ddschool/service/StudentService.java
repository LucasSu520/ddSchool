package com.duoduo.ddschool.service;

import com.duoduo.ddschool.beans.Student;
import com.duoduo.ddschool.dao.StudentMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Resource
    private StudentMapper studentMapper;

    public List<Student> queryList(){
        return studentMapper.selectList();
    }
}
