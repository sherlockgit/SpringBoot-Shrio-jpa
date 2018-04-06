package com.sherlock.premssion.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 用户
 * author: 小宇宙
 * date: 2018/4/5
 */
@Data
@Entity
public class SysUser {

    /**
     * 主键id
     */
    @Id
    @GeneratedValue
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
    private String salt;

    /**
     * 是否禁用 0：否；1：是
     */
    private String forbidden;
}
