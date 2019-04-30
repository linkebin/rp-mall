package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.NoticeAdministration;
import com.company.project.service.NoticeAdministrationService;
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
@RequestMapping("/notice/administration")
public class NoticeAdministrationController {
    @Resource
    private NoticeAdministrationService noticeAdministrationService;

    @PostMapping
    public Result add(NoticeAdministration noticeAdministration) {
        noticeAdministration.setId(UUID.randomUUID().toString());
        noticeAdministrationService.save(noticeAdministration);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id) {
        noticeAdministrationService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(NoticeAdministration noticeAdministration) {
        noticeAdministrationService.update(noticeAdministration);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
        NoticeAdministration noticeAdministration = noticeAdministrationService.findById(id);
        return ResultGenerator.genSuccessResult(noticeAdministration);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<NoticeAdministration> list = noticeAdministrationService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessTable(pageInfo);
    }
}
