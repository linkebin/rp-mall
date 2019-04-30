package com.company.project.service.impl;

import com.company.project.dao.SecMenuMapper;
import com.company.project.model.SecMenu;
import com.company.project.service.SecMenuService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class SecMenuServiceImpl extends AbstractService<SecMenu> implements SecMenuService {
    @Resource
    private SecMenuMapper secMenuMapper;

}
