package com.duoduo.ddschool.controller;

import com.duoduo.ddschool.beans.Student;
import com.duoduo.ddschool.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 学生类controller接口
 */
@RestController
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping("/student/list")
    public List<Student> queryList() {
        return studentService.queryList();
    }
}
