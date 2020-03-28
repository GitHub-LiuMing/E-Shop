package com.liuming.eshop.service.itemService.impl;

import com.liuming.eshop.entity.classifyEntity.Classify;
import com.liuming.eshop.entity.itemEntity.Item;
import com.liuming.eshop.mapper.classifyMapper.ClassifyMapper;
import com.liuming.eshop.mapper.itemMapper.ItemMapper;
import com.liuming.eshop.service.itemService.ItemService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 商品基础库
 * @ClassName ItemServiceImpl
 * @Author 张孙峰
 * @date 2019.11.11 14:36
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Resource
    private ItemMapper itemMapper;

    @Resource
    private ClassifyMapper classifyMapper;

    @Override
    public DataResult addItem(Item item) {
        Map map = new HashMap();
        map.put("classifyId",item.getClassifyId());
        List<Classify> classify = classifyMapper.findClassify(map);
        item.setClassifyName(classify.get(0).getClassifyName());
        item.setItemId(IDUtils.getId());
        item.setItemCreatedDate(new Date());
        item.setItemUpdatedDate(new Date());
        int i = itemMapper.insertSelective(item);
        if (i > 0) {
            return DataResult.build(200, "商品新增成功");
        } else {
            return DataResult.build(500, "商品新增失败，请重试");
        }
    }

    @Override
    public DataResult findItem(int pageNum, int pageSize, Item item) {
        Map map = new HashMap();
        map.put("itemId", item.getItemId());
        map.put("itemName", item.getItemName());
        map.put("classifyId", item.getClassifyId());
        map.put("classifyName", item.getClassifyName());
        map.put("commissionId", item.getCommissionId());
        map.put("logisticsTemplateId", item.getLogisticsTemplateId());
        map.put("itemOriginalPrice", item.getItemOriginalPrice());
        map.put("itemPresentPrice", item.getItemPresentPrice());
        map.put("itemUrl", item.getItemUrl());
        map.put("stockNum", item.getStockNum());
        map.put("salesNum", item.getSalesNum());
        map.put("memberDiscountedStatus", item.getMemberDiscountedStatus());
        map.put("memberDiscounted", item.getMemberDiscounted());
        map.put("notMemberDiscountedStatus", item.getNotMemberDiscountedStatus());
        map.put("notMemberDiscounted", item.getNotMemberDiscounted());
        map.put("gmsxjf", item.getGmsxjf());
        map.put("mrxg", item.getMrxg());
        map.put("mrmtxg", item.getMrmtxg());
        map.put("sfsyyhq", item.getSfsyyhq());
        map.put("itemStatus", item.getItemStatus());
        map.put("itemType", item.getItemType());
        map.put("itemCreatedDate", item.getItemCreatedDate());
        map.put("itemUpdatedDate", item.getItemUpdatedDate());
        map.put("itemDesc", item.getItemDesc());
        List<Item> itemList = itemMapper.findItem(map);
        return DataResult.ok(itemList);
    }

    @Override
    public DataResult updateItem(Item item) {
        item.setItemUpdatedDate(new Date());
        int i = itemMapper.updateByPrimaryKeySelective(item);
        if (i > 0){
            return DataResult.build(200,"商品更新成功");
        } else {
            return DataResult.build(500,"商品更新失败，请重试");
        }
    }
}
