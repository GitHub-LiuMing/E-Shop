package com.liuming.eshop.service.itemService.impl;

import com.liuming.eshop.entity.itemEntity.Item;
import com.liuming.eshop.mapper.itemMapper.ItemMapper;
import com.liuming.eshop.service.itemService.ItemService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Description 商品基础库
 * @ClassName ItemServiceImpl
 * @Author 鲸落
 * @date 2019.11.11 14:36
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Resource
    private ItemMapper itemMapper;

    @Override
    public DataResult addItem(Item item) {
        item.setItemId(IDUtils.getId());
        item.setItemCreatedDate(new Date());
        item.setItemUpdatedDate(new Date());
        int i = itemMapper.insertSelective(item);
        if (i > 0){
            return DataResult.build(200,"商品新增成功");
        } else {
            return DataResult.build(500,"商品新增失败，请重试");
        }
    }

    @Override
    public DataResult findItem(int pageNum, int pageSize, Item item) {
        return null;
    }
}
