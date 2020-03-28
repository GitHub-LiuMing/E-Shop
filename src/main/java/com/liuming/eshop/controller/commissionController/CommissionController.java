package com.liuming.eshop.controller.commissionController;

import com.liuming.eshop.entity.commissionEntity.Commission;
import com.liuming.eshop.service.commissionService.CommissionService;
import com.liuming.eshop.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 佣金
 * @ClassName CommissionController
 * @Author 鲸落
 * @date 2019.12.25 10:45
 */
@RestController
@RequestMapping("/commission")
public class CommissionController {
    @Resource
    private CommissionService commissionService;

    /**
     * @Description 新增佣金
     * @param commission
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.25 11:03
     */
    @RequestMapping("/addCommission")
    public DataResult addCommission(Commission commission){
        if (StringUtils.isNotBlank(commission.getCommissionName())){
            return commissionService.addCommission(commission);
        } else {
            return DataResult.build(500,"佣金名称不得为空");
        }
    }

    /**
     * @Description 查询佣金
     * @param commission
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.25 11:05
     */
    @RequestMapping("/findCommission")
    public DataResult findCommission(Commission commission){
        return commissionService.findCommission(commission);
    }
}
