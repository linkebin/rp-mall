package com.company.project.service.impl;

import com.company.project.dao.CustAccountMapper;
import com.company.project.model.CustAccount;
import com.company.project.service.CustAccountService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class CustAccountServiceImpl extends AbstractService<CustAccount> implements CustAccountService {
    @Resource
    private CustAccountMapper custAccountMapper;

}
