package com.liuming.eshop.service.commissionService.impl;

import com.liuming.eshop.entity.commissionEntity.Commission;
import com.liuming.eshop.mapper.commissionMapper.CommissionMapper;
import com.liuming.eshop.service.commissionService.CommissionService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 
 * @ClassName CommissionServiceImpl
 * @Author 鲸落
 * @date 2019.12.25 10:45
 */
@Service
public class CommissionServiceImpl implements CommissionService {
    @Resource
    private CommissionMapper commissionMapper;

    @Override
    public DataResult addCommission(Commission commission) {
        commission.setCommissionId(IDUtils.getId());
        commission.setCommissionCreatedDate(new Date());
        commission.setCommissionUpdatedDate(new Date());
        int i = commissionMapper.insertSelective(commission);
        if (i > 0){
            return DataResult.build(200,"佣金新增成功");
        } else {
            return DataResult.build(500,"佣金新增失败，请重试");
        }
    }

    @Override
    public DataResult findCommission(Commission commission) {
        Map map = new HashMap();
        map.put("commissionId",commission.getCommissionId());
        map.put("commissionName",commission.getCommissionName());

        //会员
        map.put("hyHyZtPrice",commission.getHyHyZtPrice());
        map.put("hyGjZtPrice",commission.getHyGjZtPrice());
        map.put("hyDlZtPrice",commission.getHyDlZtPrice());

        //高级
        map.put("gjHyZtPrice",commission.getGjHyZtPrice());
        map.put("gjHyTdPrice",commission.getGjHyTdPrice());
        map.put("gjHyFgPrice",commission.getGjHyFgPrice());
        map.put("gjGjZtPrice",commission.getGjGjZtPrice());
        map.put("gjGjJtPrice",commission.getGjGjJtPrice());
        map.put("gjDlZtPrice",commission.getGjDlZtPrice());
        map.put("gjDlJtPrice",commission.getGjDlJtPrice());

        //VIP
        map.put("vipHyZtPrice",commission.getVipHyZtPrice());
        map.put("vipHyTdPrice",commission.getVipHyTdPrice());
        map.put("vipHyFgPrice",commission.getVipHyFgPrice());
        map.put("vipGjZtPrice",commission.getVipGjZtPrice());
        map.put("vipGjJtPrice",commission.getVipGjJtPrice());
        map.put("vipGjTdPrice",commission.getVipGjTdPrice());
        map.put("vipDlZtPrice",commission.getVipDlZtPrice());
        map.put("vipDlJtPrice",commission.getVipDlJtPrice());

        //至尊
        map.put("zzHyZtPrice",commission.getZzHyZtPrice());
        map.put("zzHyTdPrice",commission.getZzHyTdPrice());
        map.put("zzHyFgPrice",commission.getZzHyFgPrice());
        map.put("zzGjZtPrice",commission.getZzGjZtPrice());
        map.put("zzGjJjPrice",commission.getZzGjJjPrice());
        map.put("zzGjTdPrice",commission.getZzGjTdPrice());
        map.put("zzGjPjPrice",commission.getZzGjPjPrice());
        map.put("zzDlZtPrice",commission.getZzDlZtPrice());
        map.put("zzDlJtPrice",commission.getZzDlJtPrice());

        //代理
        map.put("dlHyZtPrice",commission.getDlHyZtPrice());
        map.put("dlHyTdPrice",commission.getDlHyTdPrice());
        map.put("dlHyFgPrice",commission.getDlHyFgPrice());
        map.put("dlGjZtPrice",commission.getDlGjZtPrice());
        map.put("dlGjJtPrice",commission.getDlGjJtPrice());
        map.put("dlDlZtPercent",commission.getDlDlZtPercent());
        map.put("dlDlJtPercent",commission.getDlDlJtPercent());

        map.put("commissionStatus",commission.getCommissionStatus());
        map.put("commissionCreatedDate",commission.getCommissionCreatedDate());
        map.put("commissionUpdatedDate",commission.getCommissionUpdatedDate());
        List<Commission> commissionList = commissionMapper.findCommission(map);
        return DataResult.ok(commissionList);
    }
}
