package com.company.project.service.impl;

import com.company.project.dao.BonusPointsJrMapper;
import com.company.project.model.BonusPointsJr;
import com.company.project.service.BonusPointsJrService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class BonusPointsJrServiceImpl extends AbstractService<BonusPointsJr> implements BonusPointsJrService {
    @Resource
    private BonusPointsJrMapper bonusPointsJrMapper;

}
