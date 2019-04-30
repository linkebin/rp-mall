package com.company.project.service.impl;

import com.company.project.dao.AccountJrMapper;
import com.company.project.model.AccountJr;
import com.company.project.service.AccountJrService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class AccountJrServiceImpl extends AbstractService<AccountJr> implements AccountJrService {
    @Resource
    private AccountJrMapper accountJrMapper;

}
