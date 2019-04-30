package com.company.project.service.impl;

import com.company.project.dao.OrderDeMapper;
import com.company.project.model.OrderDe;
import com.company.project.service.OrderDeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class OrderDeServiceImpl extends AbstractService<OrderDe> implements OrderDeService {
    @Resource
    private OrderDeMapper orderDeMapper;

}
