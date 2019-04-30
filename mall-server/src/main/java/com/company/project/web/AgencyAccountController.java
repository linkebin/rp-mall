package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.AgencyAccount;
import com.company.project.service.AgencyAccountService;
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
@RequestMapping("/agency/account")
public class AgencyAccountController {
    @Resource
    private AgencyAccountService agencyAccountService;

    @PostMapping
    public Result add(AgencyAccount agencyAccount) {
        agencyAccount.setId(UUID.randomUUID().toString());
        agencyAccountService.save(agencyAccount);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        agencyAccountService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(AgencyAccount agencyAccount) {
        agencyAccountService.update(agencyAccount);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        AgencyAccount agencyAccount = agencyAccountService.findById(id);
        return ResultGenerator.genSuccessResult(agencyAccount);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<AgencyAccount> list = agencyAccountService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessTable(pageInfo);
    }
}
