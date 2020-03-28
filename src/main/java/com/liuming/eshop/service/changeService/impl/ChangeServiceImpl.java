package com.liuming.eshop.service.changeService.impl;

import com.liuming.eshop.entity.changeEntity.Change;
import com.liuming.eshop.mapper.changeMapper.ChangeMapper;
import com.liuming.eshop.service.changeService.ChangeService;
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
        map.put("changeType",change.getChangeType());
        map.put("changeStatus",change.getChangeStatus());
        map.put("changeCreateDate",change.getChangeCreateDate());
        map.put("changeUpdateDate",change.getChangeUpdateDate());
        List<Change> changeList = changeMapper.findChange(map);
        return DataResult.ok(changeList);
    }
}
