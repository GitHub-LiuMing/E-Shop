package com.liuming.eshop.controller.memberLevelController;

import com.liuming.eshop.entity.memberLevelEntity.MemberLevel;
import com.liuming.eshop.service.memberLevelService.MemberLevelService;
import com.liuming.eshop.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 会员等级
 * @ClassName MemberLevelController
 * @Author 张孙峰
 * @date 2019.11.12 14:21
 */
@RestController
@RequestMapping("/memberLevel")
public class MemberLevelController {
    @Autowired
    private MemberLevelService memberLevelService;

    @RequestMapping("/addMemberLevel")
    public DataResult addMemberLevel(@RequestBody(required = false) MemberLevel memberLevel){
        //判断等级名称是否为空
        if (StringUtils.isNotBlank(memberLevel.getMemberLevelName())) {
            return memberLevelService.addMemberLevel(memberLevel);
        } else {
            return DataResult.build(500,"会员等级名称不得为空");
        }
    }

    @RequestMapping("/findMemberLevel")
    public DataResult findMemberLevel(@RequestBody(required = false) MemberLevel memberLevel){
        return memberLevelService.findMemberLevel(memberLevel);
    }
}
