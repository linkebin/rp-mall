package com.company.project.service.impl;

import com.company.project.dao.SecMenuRoleMapper;
import com.company.project.model.SecMenuRole;
import com.company.project.service.SecMenuRoleService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class SecMenuRoleServiceImpl extends AbstractService<SecMenuRole> implements SecMenuRoleService {
    @Resource
    private SecMenuRoleMapper secMenuRoleMapper;

}
