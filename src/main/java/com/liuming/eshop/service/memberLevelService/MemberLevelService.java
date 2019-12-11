package com.liuming.eshop.service.memberLevelService;

import com.liuming.eshop.entity.memberLevelEntity.MemberLevel;
import com.liuming.eshop.utils.DataResult;

public interface MemberLevelService {
    DataResult addMemberLevel(MemberLevel memberLevel);

    DataResult findMemberLevel(MemberLevel memberLevel);
}
