package com.liuming.eshop.service.provincialAgentItemService.impl;

import com.liuming.eshop.entity.provincialAgentItemEntity.ProvincialAgentItem;
import com.liuming.eshop.mapper.provincialAgentItemMapper.ProvincialAgentItemMapper;
import com.liuming.eshop.service.provincialAgentItemService.ProvincialAgentItemService;
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
 * @ClassName ProvincialAgentItemServiceImpl
 * @Author 张孙峰
 * @date 2019.12.18 10:25
 */
@Service
public class ProvincialAgentItemServiceImpl implements ProvincialAgentItemService {
    @Resource
    private ProvincialAgentItemMapper provincialAgentItemMapper;

    @Override
    public DataResult addProvincialAgentItem(ProvincialAgentItem provincialAgentItem) {
        provincialAgentItem.setProvincialAgentItemId(IDUtils.getId());
        provincialAgentItem.setProvincialAgentItemCreatedDate(new Date());
        provincialAgentItem.setProvincialAgentItemUpdatedDate(new Date());
        int i = provincialAgentItemMapper.insertSelective(provincialAgentItem);
        if (i > 0){
            return DataResult.build(200,"省代商品添加成功");
        } else {
            return DataResult.build(500,"省代商品添加失败，请重试");
        }
    }

    @Override
    public DataResult findProvincialAgentItem(int pageNum, int pageSize, ProvincialAgentItem provincialAgentItem) {
        Map map = new HashMap();
        map.put("provincialAgentItemId",provincialAgentItem.getProvincialAgentItemId());
        map.put("provincialAgentId",provincialAgentItem.getProvincialAgentId());
        map.put("provincialAgentName",provincialAgentItem.getProvincialAgentName());
        map.put("itemId",provincialAgentItem.getItemId());
        map.put("itemName",provincialAgentItem.getItemName());
        map.put("classifyId",provincialAgentItem.getClassifyId());
        map.put("classifyName",provincialAgentItem.getClassifyName());
        map.put("provincialAgentItemOriginalPrice",provincialAgentItem.getProvincialAgentItemOriginalPrice());
        map.put("provincialAgentItemPresentPrice",provincialAgentItem.getProvincialAgentItemPresentPrice());
        map.put("provincialAgentItemUrl",provincialAgentItem.getProvincialAgentItemUrl());
        map.put("stockNum",provincialAgentItem.getStockNum());
        map.put("salesNum",provincialAgentItem.getSalesNum());
        map.put("provincialAgentItemStatus",provincialAgentItem.getProvincialAgentItemStatus());
        map.put("provincialAgentItemType",provincialAgentItem.getProvincialAgentItemType());
        map.put("provincialAgentItemCreatedDate",provincialAgentItem.getProvincialAgentItemCreatedDate());
        map.put("provincialAgentItemUpdatedDate",provincialAgentItem.getProvincialAgentItemUpdatedDate());
        map.put("provincialAgentItemDesc",provincialAgentItem.getProvincialAgentItemDesc());
        List<ProvincialAgentItem> provincialAgentItemList = provincialAgentItemMapper.findProvincialAgentItem(map);
        // TODO: 2019/12/18 待完善分页
        return DataResult.ok(provincialAgentItemList);
    }

    @Override
    public DataResult updateProvincialAgentItem(ProvincialAgentItem provincialAgentItem) {
        Map map = new HashMap();
        map.put("provincialAgentItemId",provincialAgentItem.getProvincialAgentItemId());
        map.put("provincialAgentId",provincialAgentItem.getProvincialAgentId());
        map.put("provincialAgentName",provincialAgentItem.getProvincialAgentName());
        map.put("itemId",provincialAgentItem.getItemId());
        map.put("itemName",provincialAgentItem.getItemName());
        map.put("classifyId",provincialAgentItem.getClassifyId());
        map.put("classifyName",provincialAgentItem.getClassifyName());
        map.put("provincialAgentItemOriginalPrice",provincialAgentItem.getProvincialAgentItemOriginalPrice());
        map.put("provincialAgentItemPresentPrice",provincialAgentItem.getProvincialAgentItemPresentPrice());
        map.put("provincialAgentItemUrl",provincialAgentItem.getProvincialAgentItemUrl());
        map.put("stockNum",provincialAgentItem.getStockNum());
        map.put("salesNum",provincialAgentItem.getSalesNum());
        map.put("provincialAgentItemStatus",provincialAgentItem.getProvincialAgentItemStatus());
        map.put("provincialAgentItemType",provincialAgentItem.getProvincialAgentItemType());
        map.put("provincialAgentItemCreatedDate",provincialAgentItem.getProvincialAgentItemCreatedDate());
        map.put("provincialAgentItemUpdatedDate",new Date());
        map.put("provincialAgentItemDesc",provincialAgentItem.getProvincialAgentItemDesc());
        int i = provincialAgentItemMapper.updateProvincialAgentItem(map);
        if(i > 0){
            return DataResult.build(200,"更新成功");
        } else {
            return DataResult.build(500,"更新失败，请重试");
        }
    }
}
