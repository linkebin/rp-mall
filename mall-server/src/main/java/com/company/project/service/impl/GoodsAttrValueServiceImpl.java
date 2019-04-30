package com.company.project.service.impl;

import com.company.project.dao.GoodsAttrValueMapper;
import com.company.project.model.GoodsAttrValue;
import com.company.project.service.GoodsAttrValueService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class GoodsAttrValueServiceImpl extends AbstractService<GoodsAttrValue> implements GoodsAttrValueService {
    @Resource
    private GoodsAttrValueMapper goodsAttrValueMapper;

}
