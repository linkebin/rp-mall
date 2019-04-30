package com.company.project.service.impl;

import com.company.project.dao.BehaviorLogMapper;
import com.company.project.model.BehaviorLog;
import com.company.project.service.BehaviorLogService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class BehaviorLogServiceImpl extends AbstractService<BehaviorLog> implements BehaviorLogService {
    @Resource
    private BehaviorLogMapper behaviorLogMapper;

}
