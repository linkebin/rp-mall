package com.company.project.service.impl;

import com.company.project.dao.SupplierMapper;
import com.company.project.model.Supplier;
import com.company.project.service.SupplierService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class SupplierServiceImpl extends AbstractService<Supplier> implements SupplierService {
    @Resource
    private SupplierMapper supplierMapper;

}
