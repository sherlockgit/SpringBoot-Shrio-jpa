package com.sherlock.premssion.service.impl;

import com.sherlock.premssion.repository.SysRoleResourceRepository;
import com.sherlock.premssion.service.SysRoleResourceService;
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
public class SysRoleResourceServiceImpl implements SysRoleResourceService {

    @Autowired
    SysRoleResourceRepository sysRoleResourceRepository;
}
