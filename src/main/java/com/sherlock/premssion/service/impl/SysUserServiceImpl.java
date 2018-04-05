package com.sherlock.premssion.service.impl;

import com.sherlock.premssion.repository.SysUserRepository;
import com.sherlock.premssion.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * author: 小宇宙
 * date: 2018/4/5
 */
@Service
@Transactional
@Slf4j
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    SysUserRepository sysUserRepository;
}
