package com.sherlock.premssion.service;

import com.sherlock.premssion.from.SysUserFrom;
import com.sherlock.premssion.model.SysUser;
import com.sherlock.premssion.vo.R;
import org.springframework.data.domain.Pageable;


/**
 * author: 小宇宙
 * date: 2018/4/5
 */
public interface SysUserService {

    SysUser findByAccount(String account);

    R saveUser(SysUserFrom sysUserFrom);

    R selectUserList(String name, Pageable pageable);

    R selectUserDetial(Integer id);

    R updateUser(SysUserFrom sysUserFrom);

    R delectUser(Integer id);
}
