package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.SecOrg;
import com.company.project.service.SecOrgService;
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
@RequestMapping("/sec/org")
public class SecOrgController {
    @Resource
    private SecOrgService secOrgService;

    @PostMapping
    public Result add(SecOrg secOrg) {
        secOrg.setId(UUID.randomUUID().toString());
        secOrgService.save(secOrg);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        secOrgService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(SecOrg secOrg) {
        secOrgService.update(secOrg);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        SecOrg secOrg = secOrgService.findById(id);
        return ResultGenerator.genSuccessResult(secOrg);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SecOrg> list = secOrgService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessTable(pageInfo);
    }
}
