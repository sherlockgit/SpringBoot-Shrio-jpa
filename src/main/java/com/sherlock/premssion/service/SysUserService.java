package com.sherlock.premssion.service;

import com.sherlock.premssion.model.SysUser;


/**
 * author: 小宇宙
 * date: 2018/4/5
 */
public interface SysUserService {

    /**
     * 根据账号查询用户
      * @param account
     * @return
     */
    SysUser findByAccount(String account);
}
