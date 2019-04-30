package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.SecMenuRole;
import com.company.project.service.SecMenuRoleService;
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
@RequestMapping("/sec/menu/role")
public class SecMenuRoleController {
    @Resource
    private SecMenuRoleService secMenuRoleService;

    @PostMapping
    public Result add(SecMenuRole secMenuRole) {
        secMenuRole.setId(UUID.randomUUID().toString());
        secMenuRoleService.save(secMenuRole);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        secMenuRoleService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(SecMenuRole secMenuRole) {
        secMenuRoleService.update(secMenuRole);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        SecMenuRole secMenuRole = secMenuRoleService.findById(id);
        return ResultGenerator.genSuccessResult(secMenuRole);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SecMenuRole> list = secMenuRoleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessTable(pageInfo);
    }
}
