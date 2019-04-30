package com.company.project.service.impl;

import com.company.project.dao.SysMessageMapper;
import com.company.project.model.SysMessage;
import com.company.project.service.SysMessageService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class SysMessageServiceImpl extends AbstractService<SysMessage> implements SysMessageService {
    @Resource
    private SysMessageMapper sysMessageMapper;

}
