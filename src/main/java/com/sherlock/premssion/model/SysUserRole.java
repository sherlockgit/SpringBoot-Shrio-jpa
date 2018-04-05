package com.sherlock.premssion.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 用户角色关系
 * author: 小宇宙
 * date: 2018/4/5
 */
@Data
@Entity
public class SysUserRole {

    /**
     * 主键id
     */
    @Id
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
