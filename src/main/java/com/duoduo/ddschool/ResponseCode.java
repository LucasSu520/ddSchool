package com.duoduo.ddschool;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCode {
    // 登录失败
    LOGIN_FAIL("10001"),

    // 重定向
    REDIRECT("10002");

    String code;
}
