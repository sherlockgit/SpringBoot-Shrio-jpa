package com.sherlock.premssion.service.impl;

import com.sherlock.premssion.repository.SysResourceRepository;
import com.sherlock.premssion.service.SysResourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * author: 小宇宙
 * date: 2018/4/5
 */
@Service
@Slf4j
@Transactional
public class SysResourceServiceImpl implements SysResourceService {

    @Autowired
    SysResourceRepository sysResourceRepository;
}
