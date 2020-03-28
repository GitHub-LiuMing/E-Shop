package com.liuming.eshop.service.memberLevelService.impl;

import com.liuming.eshop.entity.memberLevelEntity.MemberLevel;
import com.liuming.eshop.mapper.memberLevelMapper.MemberLevelMapper;
import com.liuming.eshop.service.memberLevelService.MemberLevelService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description 
 * @ClassName MemberLevelServiceImpl
 * @Author 张孙峰
 * @date 2019.11.12 14:20
 */
@Service
public class MemberLevelServiceImpl implements MemberLevelService {
    @Autowired
    private MemberLevelMapper memberLevelMapper;

    @Override
    public DataResult addMemberLevel(MemberLevel memberLevel) {
        memberLevel.setMemberLevelId(IDUtils.getId());
        memberLevel.setMemberLevelCreatedDate(new Date());
        memberLevel.setMemberLevelUpdatedDate(new Date());
        int i = memberLevelMapper.insertSelective(memberLevel);
        if (i == 0) {
            return DataResult.build(500,"会员等级新增失败");
        } else {
            return DataResult.ok();
        }
    }

    @Override
    public DataResult findMemberLevel(MemberLevel memberLevel) {
        //判断会员等级ID是否为空，如果为空，返回全部会员等级，如果不为空，返回ID对应的会员等级信息
        if (memberLevel != null) {
            MemberLevel memberLevelById = memberLevelMapper.selectByPrimaryKey(memberLevel.getMemberLevelId());
            return DataResult.ok(memberLevelById);
        } else {
            List<MemberLevel> memberLevels = memberLevelMapper.findMemberLevelAll();
            return DataResult.ok(memberLevels);
        }
    }
}
