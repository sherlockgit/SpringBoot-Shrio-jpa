package com.sherlock.premssion.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 资源
 * author: 小宇宙
 * date: 2018/4/5
 */
@Data
@Entity
public class SysResource {

    /**
     * 主键id
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 资源父id
     */
    private Integer parentId;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 权限标识符
     */
    private String perms;

    /**
     * 类型：0：目录，1：菜单，2：按钮
     */
    private String type;
}
