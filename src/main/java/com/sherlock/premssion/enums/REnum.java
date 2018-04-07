package com.sherlock.premssion.enums;

/**
 * Http返回信息枚举
 * author: 小宇宙
 * date: 2018/4/5
 */
public enum REnum {

    UNkNOWN_ACCOUNT(1,"用户不存在"),

    PARAM_ERROR(2, "参数不正确"),

    ACCOUNT_EXIST(3,"该账号已存在");

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    REnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
