package com.sherlock.premssion.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Http返回的对象模型
 * author: 小宇宙
 * date: 2018/4/5
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class R<T> {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体数据
     */
    private T data;
}
