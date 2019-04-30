package com.company.project.service.impl;

import com.company.project.dao.ReAddrMapper;
import com.company.project.model.ReAddr;
import com.company.project.service.ReAddrService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class ReAddrServiceImpl extends AbstractService<ReAddr> implements ReAddrService {
    @Resource
    private ReAddrMapper reAddrMapper;

}
