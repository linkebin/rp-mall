package com.company.project.service;

import com.company.project.core.Service;
import com.company.project.model.GoodsType;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
public interface GoodsTypeService extends Service<GoodsType> {
    List<GoodsType> findByFId(String fid);
    List<Map> findByKey(String key);
}
