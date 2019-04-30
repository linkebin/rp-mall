package com.company.project.service.impl;

import com.company.project.dao.SecMenuMemberMapper;
import com.company.project.model.SecMenuMember;
import com.company.project.service.SecMenuMemberService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/30.
 */
@Service
@Transactional
public class SecMenuMemberServiceImpl extends AbstractService<SecMenuMember> implements SecMenuMemberService {
    @Resource
    private SecMenuMemberMapper secMenuMemberMapper;

}
