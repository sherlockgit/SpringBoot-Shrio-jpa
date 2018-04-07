package com.sherlock.premssion.exception;

import com.sherlock.premssion.enums.REnum;

/**
 * 自定义异常类
 * author: 小宇宙
 * date: 2018/4/5
 */
public class SystemException extends RuntimeException{

    private Integer code;

    public SystemException(REnum rEnum) {
        super(rEnum.getMessage());

        this.code = rEnum.getCode();
    }

    public SystemException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(String message) {
        super(message);
    }
}
