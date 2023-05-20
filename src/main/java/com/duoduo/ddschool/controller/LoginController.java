package com.duoduo.ddschool.controller;


import com.duoduo.ddschool.ResponseCode;
import com.duoduo.ddschool.beans.RequestResponse;
import com.duoduo.ddschool.beans.User;
import com.duoduo.ddschool.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.http.RequestEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

@RestController
public class LoginController {
    @Resource
    private UserService userService;

    @GetMapping({"","/","/index"})
    public RequestResponse index(Model model, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return new RequestResponse(ResponseCode.REDIRECT.getCode(), "users/index", null);
    }

    @GetMapping("/login")
    public RequestResponse loginIndex() {
        return new RequestResponse(ResponseCode.REDIRECT.getCode(), "users/login", null);
    }

    @PostMapping("/login")
    public RequestResponse login(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password, Model model, HttpServletRequest request) {
        User user = userService.getUserByUsername(username);
        if (user == null) {
            return new RequestResponse(ResponseCode.LOGIN_FAIL.getCode(), "login fail", null);
        }

        String pwd = user.getPassword();
        if (pwd.equals(password)) {
            model.addAttribute("user", user);
            request.getSession().setAttribute("user", user);
            return new RequestResponse(ResponseCode.REDIRECT.getCode(), "users/index", "log in success");
        } else {
            return new RequestResponse(ResponseCode.LOGIN_FAIL.getCode(), "login fail", null);
        }
    }
}
