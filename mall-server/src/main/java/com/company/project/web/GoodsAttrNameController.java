package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.GoodsAttrName;
import com.company.project.service.GoodsAttrNameService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/04/30.
*/
@RestController
@RequestMapping("/goods/attr/name")
public class GoodsAttrNameController {
    @Resource
    private GoodsAttrNameService goodsAttrNameService;

    @PostMapping
    public Result add(@RequestBody GoodsAttrName goodsAttrName) {
        goodsAttrNameService.save(goodsAttrName);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        goodsAttrNameService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody GoodsAttrName goodsAttrName) {
        goodsAttrNameService.update(goodsAttrName);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        GoodsAttrName goodsAttrName = goodsAttrNameService.findById(id);
        return ResultGenerator.genSuccessResult(goodsAttrName);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<GoodsAttrName> list = goodsAttrNameService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
