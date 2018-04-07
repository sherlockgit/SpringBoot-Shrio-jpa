package com.sherlock.premssion.enums;

/**
 * 系统用户状态枚举
 * author: 小宇宙
 * date: 2018/4/5
 */
public enum  ForbiddenEnum {

    ENABLE(0,"启用"),

    DISABLE(1,"禁用");

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ForbiddenEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
