package com.duoduo.ddschool.dao;

import com.duoduo.ddschool.beans.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectUserByPwd(String name);
}
