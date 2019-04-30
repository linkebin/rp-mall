package com.company.project.service.impl;

import com.company.project.dao.SecRoleMapper;
import com.company.project.model.SecRole;
import com.company.project.service.SecRoleService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class SecRoleServiceImpl extends AbstractService<SecRole> implements SecRoleService {
    @Resource
    private SecRoleMapper secRoleMapper;

}
