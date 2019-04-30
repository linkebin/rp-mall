package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.GoodsAttrValue;
import com.company.project.service.GoodsAttrValueService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
* Created by CodeGenerator on 2019/04/30.
*/
@RestController
@RequestMapping("/goods/attr/value")
public class GoodsAttrValueController {
    @Resource
    private GoodsAttrValueService goodsAttrValueService;

    @PostMapping
    public Result add(GoodsAttrValue goodsAttrValue) {
        goodsAttrValue.setId(UUID.randomUUID().toString());
        goodsAttrValueService.save(goodsAttrValue);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        goodsAttrValueService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(GoodsAttrValue goodsAttrValue) {
        goodsAttrValueService.update(goodsAttrValue);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        GoodsAttrValue goodsAttrValue = goodsAttrValueService.findById(id);
        return ResultGenerator.genSuccessResult(goodsAttrValue);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<GoodsAttrValue> list = goodsAttrValueService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessTable(pageInfo);
    }
}
