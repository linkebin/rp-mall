package com.company.project.service.impl;

import com.company.project.dao.AgencyAccountMapper;
import com.company.project.model.AgencyAccount;
import com.company.project.service.AgencyAccountService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class AgencyAccountServiceImpl extends AbstractService<AgencyAccount> implements AgencyAccountService {
    @Resource
    private AgencyAccountMapper agencyAccountMapper;

}
