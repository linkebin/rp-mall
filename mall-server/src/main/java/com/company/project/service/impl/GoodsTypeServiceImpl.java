package com.company.project.service.impl;

import com.company.project.dao.GoodsTypeMapper;
import com.company.project.model.GoodsType;
import com.company.project.service.GoodsTypeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class GoodsTypeServiceImpl extends AbstractService<GoodsType> implements GoodsTypeService {
    @Resource
    private GoodsTypeMapper goodsTypeMapper;

}
