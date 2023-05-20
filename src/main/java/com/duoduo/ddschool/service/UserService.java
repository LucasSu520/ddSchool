package com.duoduo.ddschool.service;

import com.duoduo.ddschool.beans.User;
import com.duoduo.ddschool.dao.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User getUserByUsername(String userName) {
        return userMapper.selectUserByPwd(userName);
    }
}
