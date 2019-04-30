package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.SecRoleMenber;
import com.company.project.service.SecRoleMenberService;
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
@RequestMapping("/sec/role/menber")
public class SecRoleMenberController {
    @Resource
    private SecRoleMenberService secRoleMenberService;

    @PostMapping
    public Result add(SecRoleMenber secRoleMenber) {
        secRoleMenber.setId(UUID.randomUUID().toString());
        secRoleMenberService.save(secRoleMenber);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        secRoleMenberService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(SecRoleMenber secRoleMenber) {
        secRoleMenberService.update(secRoleMenber);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        SecRoleMenber secRoleMenber = secRoleMenberService.findById(id);
        return ResultGenerator.genSuccessResult(secRoleMenber);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SecRoleMenber> list = secRoleMenberService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessTable(pageInfo);
    }
}
