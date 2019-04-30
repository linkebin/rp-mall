package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.SecMenuMember;
import com.company.project.service.SecMenuMemberService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/04/30.
*/
@RestController
@RequestMapping("/sec/menu/member")
public class SecMenuMemberController {
    @Resource
    private SecMenuMemberService secMenuMemberService;

    @PostMapping
    public Result add(@RequestBody SecMenuMember secMenuMember) {
        secMenuMemberService.save(secMenuMember);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        secMenuMemberService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody SecMenuMember secMenuMember) {
        secMenuMemberService.update(secMenuMember);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        SecMenuMember secMenuMember = secMenuMemberService.findById(id);
        return ResultGenerator.genSuccessResult(secMenuMember);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SecMenuMember> list = secMenuMemberService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
