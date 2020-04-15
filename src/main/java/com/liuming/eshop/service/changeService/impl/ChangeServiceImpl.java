package com.liuming.eshop.service.changeService.impl;

import com.liuming.eshop.entity.changeEntity.Change;
import com.liuming.eshop.mapper.changeMapper.ChangeMapper;
import com.liuming.eshop.service.changeService.ChangeService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description 
 * @ClassName ChangeServiceImpl
 * @Author 鲸落
 * @date 2020.01.19 16:31
 */
@Service
public class ChangeServiceImpl implements ChangeService {
    @Resource
    private ChangeMapper changeMapper;

    @Override
    public DataResult addChange(Change change) {
        change.setChangeId(IDUtils.getId());
        change.setChangeStatus(1);
        change.setChangeCreateDate(new Date());
        change.setChangeUpdateDate(new Date());
        int i = changeMapper.insertSelective(change);
        if (i > 0){
            return DataResult.build(200,"零钱数据新增成功");
        } else {
            return DataResult.build(500,"零钱数据新增失败，请重试");
        }
    }

    @Override
    public DataResult findChange(Change change) {
        Map map = new HashMap();
        map.put("changeId",change.getChangeId());
        map.put("memberId",change.getMemberId());
        map.put("changePrice",change.getChangePrice());
        map.put("changeDetails",change.getChangeDetails());
        map.put("changeType",change.getChangeType());
        map.put("changeStatus",change.getChangeStatus());
        map.put("changeCreateDate",change.getChangeCreateDate());
        map.put("changeUpdateDate",change.getChangeUpdateDate());
        List<Change> changeList = changeMapper.findChange(map);
        return DataResult.ok(changeList);
    }

    @Override
    public DataResult findChangeByDTX(String memberId) {
        //待提现 = 已收入 - 已提现
        double dtx = 0.00;
        double ysr = 0.00;
        double ytx = 0.00;

        ysr = changeMapper.findChangeByMemberIdAndType(memberId, 0);
        ytx = changeMapper.findChangeByMemberIdAndType(memberId, 2);

        BigDecimal bysr = new BigDecimal(Double.toString(ysr));
        BigDecimal bytx = new BigDecimal(Double.toString(ytx));
        dtx = bysr.subtract(bytx).doubleValue();
        System.out.println(dtx);
        return DataResult.ok(dtx);
    }

    @Override
    public DataResult findChangeByYJZE(String memberId) {
        //佣金总额 = 已提现 + 待提现
        double yjze = 0.00;
        double ytx = 0.00;
        double dtx = 0.00;

        ytx = changeMapper.findChangeByMemberIdAndType(memberId, 2);
        dtx = changeMapper.findChangeByMemberIdAndType(memberId, 3);

        BigDecimal bytx = new BigDecimal(Double.toString(ytx));
        BigDecimal bdtx = new BigDecimal(Double.toString(dtx));
        yjze = bytx.add(bdtx).doubleValue();
        System.out.println(yjze);
        return DataResult.ok(yjze);
    }

    @Override
    public DataResult findChangeByDSY(String memberId) {
        //待收益
        double dsy = 0.00;

        dsy = changeMapper.findChangeByMemberIdAndType(memberId, 1);

        System.out.println(dsy);
        return DataResult.ok(dsy);
    }

    @Override
    public DataResult findChangeByYTX(String memberId) {
        //已提现 = 已收入 - 待收入 - 待提现
        double ytx = 0.00;
        double ysr = 0.00;
        double dsr = 0.00;
        double dtx = 0.00;

        ysr = changeMapper.findChangeByMemberIdAndType(memberId, 0);
        dsr = changeMapper.findChangeByMemberIdAndType(memberId, 1);
        dtx = changeMapper.findChangeByMemberIdAndType(memberId, 3);

        BigDecimal bysr = new BigDecimal(Double.toString(ysr));
        BigDecimal bdsr = new BigDecimal(Double.toString(dsr));
        BigDecimal bdtx = new BigDecimal(Double.toString(dtx));
        double ddtx = bysr.subtract(bdsr).doubleValue();
        BigDecimal bddtx = new BigDecimal(Double.toString(dtx));
        ytx = bddtx.subtract(bdtx).doubleValue();
        System.out.println(ytx);
        return DataResult.ok(ytx);
    }

    @Override
    public DataResult test(String memberId, int changeType) {
        double dtx = 0.00;
        double ysr = 0.00;
        double ytx = 0.00;
        ysr = changeMapper.findChangeByMemberIdAndType("123", 0);
        ytx = changeMapper.findChangeByMemberIdAndType("123", 2);

        dtx = ysr - ytx;
        return DataResult.ok(dtx);
    }
}
