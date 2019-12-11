package com.liuming.eshop.service.itemService.impl;

import com.liuming.eshop.mapper.itemMapper.ItemMapper;
import com.liuming.eshop.service.itemService.ItemService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 商品基础库
 * @ClassName ItemServiceImpl
 * @Author 鲸落
 * @date 2019.11.11 14:36
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;

    @Override
    public DataResult findItemAll(int pageNum, int pageSize) {
        // TODO: 2019/11/11  未完善
        return null;
    }
}
