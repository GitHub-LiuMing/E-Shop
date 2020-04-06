package com.liuming.eshop.controller.changeController;

import com.liuming.eshop.entity.changeEntity.Change;
import com.liuming.eshop.service.changeService.ChangeService;
import com.liuming.eshop.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 零钱
 * @ClassName ChangeController
 * @Author 鲸落
 * @date 2020.01.19 14:42
 */
@RestController
@RequestMapping("/change")
public class ChangeController {
    @Autowired
    private ChangeService changeService;

    /**
     * @Description 新增零钱
     * @param change
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.01.20 17:32
     */
    @RequestMapping("/addChange")
    public DataResult addChange(Change change){
        if (StringUtils.isNotBlank(change.getMemberId()) && change.getChangePrice() != null && change.getChangeType() != null){
            return changeService.addChange(change);
        } else {
            return DataResult.build(500,"会员ID、零钱金额、零钱类型不得为空");
        }
    }

    /**
     * @Description 查询零钱
     * @param change
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.01.21 18:00
     */
    @RequestMapping("/findChange")
    public DataResult findChange(Change change){
        return changeService.findChange(change);
    }

    /**
     * @Description 查询待提现
     * @param memberId
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.04.06 11:40
     */
    @RequestMapping("/findChangeByDTX")
    public DataResult findChangeByDTX(String memberId){
        return changeService.findChangeByDTX(memberId);
    }

    @RequestMapping("/test")
    public DataResult test (String memberId, int changeType){
        return changeService.test(memberId, changeType);
    }
}
