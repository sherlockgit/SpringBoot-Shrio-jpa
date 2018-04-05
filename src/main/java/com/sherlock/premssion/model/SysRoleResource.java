package com.sherlock.premssion.model;


import lombok.Data;

/**
 * 角色资源关系
 * author: 小宇宙
 * date: 2018/4/5
 */
@Data
public class SysRoleResource {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 资源id
     */
    private Integer resourceId;
}
