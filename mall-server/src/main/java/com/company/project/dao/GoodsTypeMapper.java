package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.GoodsType;

import java.util.List;

public interface GoodsTypeMapper extends Mapper<GoodsType> {
    
    List<GoodsType> findByFId(String fId);
}