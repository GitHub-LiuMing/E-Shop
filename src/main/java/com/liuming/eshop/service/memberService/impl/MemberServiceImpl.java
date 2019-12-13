package com.liuming.eshop.service.memberService.impl;

import com.liuming.eshop.mapper.memberMapper.MemberMapper;
import com.liuming.eshop.service.memberService.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberMapper memberMapper;
}
