package com.company.project.service.impl;

import com.company.project.dao.GoodsAttrNameMapper;
import com.company.project.model.GoodsAttrName;
import com.company.project.service.GoodsAttrNameService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class GoodsAttrNameServiceImpl extends AbstractService<GoodsAttrName> implements GoodsAttrNameService {
    @Resource
    private GoodsAttrNameMapper goodsAttrNameMapper;

}
