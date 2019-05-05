package com.company.project.service;

import com.company.project.model.GoodsType;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
public interface GoodsTypeService extends Service<GoodsType> {
    List<GoodsType> findByFId(String fid);
}
