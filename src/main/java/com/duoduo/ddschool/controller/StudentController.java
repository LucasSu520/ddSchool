package com.duoduo.ddschool.controller;

import com.duoduo.ddschool.beans.Student;
import com.duoduo.ddschool.service.StudentService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 学生类controller接口
 */
@RestController
public class StudentController {
    @Resource
    private StudentService studentService;

    @Resource
    private HttpServletRequest request;

    @GetMapping("/online")
    public String queryOnlineUser(){
        List onlineUserList =(List) request.getServletContext().getAttribute("onlineUserList");
        return String.valueOf(onlineUserList.size());
    }

    @GetMapping("/student/list/{name}")
    public List<Student> queryList(@PathVariable String name) {
//        如果需要在这里统计在线人数，就在访问的controller层当中添加上这行代码
//        this.request.getSession().setAttribute("online", new OnlineUserListener(name));
        return studentService.queryList();
    }
}
