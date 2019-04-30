package com.company.project.service.impl;

import com.company.project.dao.GoodsShopcarMapper;
import com.company.project.model.GoodsShopcar;
import com.company.project.service.GoodsShopcarService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class GoodsShopcarServiceImpl extends AbstractService<GoodsShopcar> implements GoodsShopcarService {
    @Resource
    private GoodsShopcarMapper goodsShopcarMapper;

}
