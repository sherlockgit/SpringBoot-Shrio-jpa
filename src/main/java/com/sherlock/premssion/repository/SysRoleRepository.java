package com.sherlock.premssion.repository;

import com.sherlock.premssion.model.SysRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * author: 小宇宙
 * date: 2018/4/5
 */
public interface SysRoleRepository extends JpaRepository<SysRole,Integer> {

    Page<SysRole> findAll(Specification<SysRole> sysRoleSpecification, Pageable pageable);
}
