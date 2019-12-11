package com.liuming.eshop.service.signService.impl;

import com.liuming.eshop.entity.signEntity.Sign;
import com.liuming.eshop.mapper.signMapper.SignMapper;
import com.liuming.eshop.service.signService.SignService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Description 
 * @ClassName SignServiceImpl
 * @Author 鲸落
 * @date 2019.08.05 10:58
 */
@Service
public class SignServiceImpl implements SignService {
    @Autowired
    private SignMapper signMapper;

    @Override
    public DataResult addSign(Sign sign) {
        if (sign.getSignRegulation() != null && sign.getSignPoints() != null){
            sign.setSignId(IDUtils.getId());
            sign.setSignCreatedDate(new Date());
            sign.setSignUpdatedDate(new Date());
            int i = signMapper.insertSelective(sign);
            if (i > 0){
                return DataResult.ok();
            }
            return DataResult.build(500,"新增签到规则失败");
        }
        return DataResult.build(500,"签到规则和签到积分不得为空");
    }
}
