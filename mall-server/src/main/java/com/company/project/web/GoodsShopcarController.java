package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.GoodsShopcar;
import com.company.project.service.GoodsShopcarService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/04/30.
*/
@RestController
@RequestMapping("/goods/shopcar")
public class GoodsShopcarController {
    @Resource
    private GoodsShopcarService goodsShopcarService;

    @PostMapping
    public Result add(@RequestBody GoodsShopcar goodsShopcar) {
        goodsShopcarService.save(goodsShopcar);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        goodsShopcarService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody GoodsShopcar goodsShopcar) {
        goodsShopcarService.update(goodsShopcar);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        GoodsShopcar goodsShopcar = goodsShopcarService.findById(id);
        return ResultGenerator.genSuccessResult(goodsShopcar);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<GoodsShopcar> list = goodsShopcarService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
