package com.liuming.eshop.controller.memberDistributionAddressController;

import com.liuming.eshop.entity.memberDistributionAddressEntity.MemberDistributionAddress;
import com.liuming.eshop.service.memberDistributionAddressService.MemberDistributionAddressService;
import com.liuming.eshop.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 会员配送地址管理
 * @ClassName MemberDistributionAddressController
 * @Author 鲸落
 * @date 2019.12.26 17:13
 */
@RestController
@RequestMapping("/memberDistributionAddress")
public class MemberDistributionAddressController {
    @Resource
    private MemberDistributionAddressService memberDistributionAddressService;

    /**
     * @Description 新增会员配送地址
     * @param memberDistributionAddress
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.26 17:20
     */
    @RequestMapping("/addMemberDistributionAddress")
    public DataResult addMemberDistributionAddress(MemberDistributionAddress memberDistributionAddress){
        if (StringUtils.isNotBlank(memberDistributionAddress.getMemberId()) && StringUtils.isNotBlank(memberDistributionAddress.getConsignee()) && StringUtils.isNotBlank(memberDistributionAddress.getPhone()) && memberDistributionAddress.getDistrictCode() != null){
            return memberDistributionAddressService.addMemberDistributionAddress(memberDistributionAddress);
        } else {
            return DataResult.build(500,"会员ID、收货人、联系方式、地区代码不得为空");
        }
    }

    /**
     * @Description 查询会员配送地址
     * @param memberDistributionAddress
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.27 11:43
     */
    @RequestMapping("/findMemberDistributionAddress")
    public DataResult findMemberDistributionAddress(MemberDistributionAddress memberDistributionAddress){
        if (StringUtils.isNotBlank(memberDistributionAddress.getMemberId()) || StringUtils.isNotBlank(memberDistributionAddress.getMemberDistributionAddressId())){
            return memberDistributionAddressService.findMemberDistributionAddress(memberDistributionAddress);
        } else {
            return DataResult.build(500,"用户信息或配送信息不存在");
        }
    }

    /**
     * @Description 更新会员配送地址
     * @param memberDistributionAddress
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.27 11:49
     */
    @RequestMapping("/updateMemberDistributionAddress")
    public DataResult updateMemberDistributionAddress(MemberDistributionAddress memberDistributionAddress){
        if (StringUtils.isNotBlank(memberDistributionAddress.getMemberDistributionAddressId())){
            return memberDistributionAddressService.updateMemberDistributionAddress(memberDistributionAddress);
        } else {
            return DataResult.build(500,"会员配送信息不存在");
        }
    }
}
