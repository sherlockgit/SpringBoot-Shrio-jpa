package com.sherlock.premssion.repository;

import com.sherlock.premssion.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * author: 小宇宙
 * date: 2018/4/5
 */
public interface SysUserRepository extends JpaRepository<SysUser,Integer> {

    /**
     * 根据账号查询用户
     * @param account
     * @return
     */
    SysUser findByAccount(String account);
}
