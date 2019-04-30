package com.company.project.service.impl;

import com.company.project.dao.PayLogMapper;
import com.company.project.model.PayLog;
import com.company.project.service.PayLogService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class PayLogServiceImpl extends AbstractService<PayLog> implements PayLogService {
    @Resource
    private PayLogMapper payLogMapper;

}
