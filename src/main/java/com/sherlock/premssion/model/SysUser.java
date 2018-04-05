package com.sherlock.premssion.model;

import lombok.Data;

/**
 * 用户
 * author: 小宇宙
 * date: 2018/4/5
 */
@Data
public class SysUser {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String sale;
}
