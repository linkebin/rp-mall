package com.company.project.service.impl;

import com.company.project.dao.NoticeAdministrationMapper;
import com.company.project.model.NoticeAdministration;
import com.company.project.service.NoticeAdministrationService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class NoticeAdministrationServiceImpl extends AbstractService<NoticeAdministration> implements NoticeAdministrationService {
    @Resource
    private NoticeAdministrationMapper noticeAdministrationMapper;

}
