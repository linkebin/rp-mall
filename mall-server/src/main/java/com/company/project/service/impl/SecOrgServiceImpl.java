package com.company.project.service.impl;

import com.company.project.dao.SecOrgMapper;
import com.company.project.model.SecOrg;
import com.company.project.service.SecOrgService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class SecOrgServiceImpl extends AbstractService<SecOrg> implements SecOrgService {
    @Resource
    private SecOrgMapper secOrgMapper;

}
