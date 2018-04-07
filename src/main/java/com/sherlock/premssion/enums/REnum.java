package com.sherlock.premssion.enums;

/**
 * Http返回信息枚举
 * author: 小宇宙
 * date: 2018/4/5
 */
public enum REnum {

    UNkNOWN_ACCOUNT(1,"用户不存在"),

    PARAM_ERROR(2, "参数不正确"),

    ACCOUNT_EXIST(3,"该账号已存在"),

    USERNAME_OR_PASSWORD_ERROR(4,"用户名或密码错误"),

    ACCOUNT_DISABLE(5,"账号已被禁用"),

    AUTH_ERROR(6,"账户验证失败"),

    NOT_LOGIN(7,"未登录"),

    NOT_PERMSSION(8,"您没有访问该功能的权限");

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
