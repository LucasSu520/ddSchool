package com.duoduo.ddschool.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学生类controller接口
 */
@RestController
public class StudentController {
    @GetMapping("/student/list")
    public String queryList() {
        return "hello world & duoduo school";
    }
}
