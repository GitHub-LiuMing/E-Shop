package com.liuming.eshop.service.memberService;

import com.liuming.eshop.entity.memberEntity.Member;
import com.liuming.eshop.utils.DataResult;

public interface MemberService {
    DataResult addMember(Member member);

    DataResult findMember(Member member);
}
