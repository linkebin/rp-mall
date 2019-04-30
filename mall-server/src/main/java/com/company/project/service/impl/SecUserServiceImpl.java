package com.company.project.service.impl;

import com.company.project.dao.SecUserMapper;
import com.company.project.model.SecUser;
import com.company.project.service.SecUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class SecUserServiceImpl extends AbstractService<SecUser> implements SecUserService {
    @Resource
    private SecUserMapper secUserMapper;

}
