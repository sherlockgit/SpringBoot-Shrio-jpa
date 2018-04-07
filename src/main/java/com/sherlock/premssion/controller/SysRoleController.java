package com.sherlock.premssion.controller;

import com.sherlock.premssion.enums.REnum;
import com.sherlock.premssion.exception.SystemException;
import com.sherlock.premssion.from.SysRoleFrom;
import com.sherlock.premssion.service.SysRoleService;
import com.sherlock.premssion.utils.Assert;
import com.sherlock.premssion.vo.R;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * author: 小宇宙
 * date: 2018/4/5
 */
@RestController
@RequestMapping("/sys")
@Slf4j
public class SysRoleController {

    @Autowired
    SysRoleService sysRoleService;

    /**
     * 新增角色
     * @param sysRoleFrom
     * @param bindingResult
     * @return
     */
    @RequiresPermissions("sys:role:insert")
    @PostMapping("/saveRole")
    public R saveRole(@Valid @RequestBody SysRoleFrom sysRoleFrom,
                      BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("【新增角色】参数不正确:sysRoleFrom={}"+ sysRoleFrom);
            throw new SystemException(REnum.PARAM_ERROR.getCode(),bindingResult.getFieldError().getDefaultMessage());
        }

        return sysRoleService.saveRole(sysRoleFrom);
    }

    /**
     * 查询角色列表
     * @param page
     * @param size
     * @param name
     * @return
     */
    @RequiresPermissions("sys:role:list")
    @GetMapping("/selectRoleList")
    public R selectRoleList(@RequestParam(value = "page", defaultValue = "0") Integer page,
                            @RequestParam(value = "size", defaultValue = "10") Integer size,
                            @RequestParam(value = "name",defaultValue = "") String name){

        PageRequest pageRequest = new PageRequest(page,size);
        return sysRoleService.selectRoleList(name,pageRequest);
    }

    /**
     * 查询订单详情
     * @param id
     * @return
     */
    @RequiresPermissions("sys:role:detail")
    @GetMapping("/selectRoleDetail")
    public R selectRoleDetail(@RequestParam(value = "id",required = false) Integer id){

        Assert.isNull(id,"id不能为空");
        return sysRoleService.selectRoleDetail(id);

    }

    /**
     * 更新角色
     * @param sysRoleFrom
     * @param bindingResult
     * @return
     */
    @RequiresPermissions("sys:role:update")
    @PutMapping("/updateRole")
    public R updateRole(@Valid @RequestBody SysRoleFrom sysRoleFrom,
                        BindingResult bindingResult){

        Assert.isNull(sysRoleFrom.getId(),"id不能为空");

        if(bindingResult.hasErrors()){
            log.error("【更新角色】参数不正确:sysRoleFrom={}"+ sysRoleFrom);
            throw new SystemException(REnum.PARAM_ERROR.getCode(),bindingResult.getFieldError().getDefaultMessage());
        }

        return sysRoleService.updateRole(sysRoleFrom);
    }

    /**
     * 删除角色
     * @param id
     * @return
     */
    @RequiresPermissions("sys:role:delete")
    @DeleteMapping("/deleteRole/{id}")
    public R deleteRole(@PathVariable Integer id){
        return sysRoleService.deleteRole(id);
    }
}
