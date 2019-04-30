package com.company.project.service.impl;

import com.company.project.dao.GoodsImgMapper;
import com.company.project.model.GoodsImg;
import com.company.project.service.GoodsImgService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class GoodsImgServiceImpl extends AbstractService<GoodsImg> implements GoodsImgService {
    @Resource
    private GoodsImgMapper goodsImgMapper;

}
