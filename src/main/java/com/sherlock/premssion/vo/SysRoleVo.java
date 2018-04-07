package com.sherlock.premssion.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sherlock.premssion.model.SysResource;
import com.sherlock.premssion.model.SysRole;
import lombok.Data;

import java.util.List;

/**
 * author: 小宇宙
 * date: 2018/4/7
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SysRoleVo {

    /**
     * 主键id
     */
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

    /**
     * 拥有资源
     */
    private List<SysResource> sysResources;
}
