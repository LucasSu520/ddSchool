package com.duoduo.ddschool.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * request请求统一返回类
 */
@Getter
@Setter
@AllArgsConstructor
public class RequestResponse {
    String code;

    String message;

    Object data;
}
