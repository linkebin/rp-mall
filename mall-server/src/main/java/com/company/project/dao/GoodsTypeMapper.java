package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.GoodsType;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GoodsTypeMapper extends Mapper<GoodsType> {
    
    List<GoodsType> findByFId(String fId);

    List<Map>  findByKey(@Param(value="key")String key);
}