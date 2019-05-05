package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.GoodsType;
import com.company.project.service.GoodsTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by CodeGenerator on 2019/04/30.
 */
@RestController
@RequestMapping("/goods/type")
public class GoodsTypeController {
    @Resource
    private GoodsTypeService goodsTypeService;

    @PostMapping
    public Result add(GoodsType goodsType) {
        goodsType.setId(UUID.randomUUID().toString());
        goodsTypeService.save(goodsType);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        goodsTypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(GoodsType goodsType) {
        goodsTypeService.update(goodsType);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        GoodsType goodsType = goodsTypeService.findById(id);
        return ResultGenerator.genSuccessResult(goodsType);
    }

    @GetMapping("/fId")
    public Result getGoodsTypeByFId(@RequestParam(defaultValue = "0") String fId, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<GoodsType> goodsTypeList = goodsTypeService.findByFId(fId);
        PageInfo pageInfo = new PageInfo(goodsTypeList);
        return ResultGenerator.genSuccessTable(pageInfo);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "") String key,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Map> list = goodsTypeService.findByKey(key);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessTable(pageInfo);
    }
}
