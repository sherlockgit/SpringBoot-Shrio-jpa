package com.sherlock.premssion.model;

import lombok.Data;

/**
 * 用户角色关系
 * author: 小宇宙
 * date: 2018/4/5
 */
@Data
public class SysUserRole {

    /**
     * 主键id
     */
    private Integer id;


    /**
     * 用户Id
     */
    private Integer userId;


    /**
     * 资源Id
     */
    private Integer resourceId;
}
