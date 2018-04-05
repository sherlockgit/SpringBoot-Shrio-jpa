package com.sherlock.premssion.controller;

import com.sherlock.premssion.service.SysRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
