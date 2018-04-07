package com.sherlock.premssion.model;

import lombok.Data;

import javax.persistence.*;

/**
 * 角色
 * author: 小宇宙
 * date: 2018/4/5
 */
@Data
@Entity
public class SysRole {

    /**
     * 主键id
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 角色名
     */
    private String name;

    /**
     * 角色等级
     */
    private Integer grade;

    /**
     * 备注
     */
    private String remark;
}
