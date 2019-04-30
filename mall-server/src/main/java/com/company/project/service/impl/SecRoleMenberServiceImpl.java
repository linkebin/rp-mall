package com.company.project.service.impl;

import com.company.project.dao.SecRoleMenberMapper;
import com.company.project.model.SecRoleMenber;
import com.company.project.service.SecRoleMenberService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class SecRoleMenberServiceImpl extends AbstractService<SecRoleMenber> implements SecRoleMenberService {
    @Resource
    private SecRoleMenberMapper secRoleMenberMapper;

}
