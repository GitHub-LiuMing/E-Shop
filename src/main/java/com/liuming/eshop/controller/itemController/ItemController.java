package com.liuming.eshop.controller.itemController;

import com.liuming.eshop.entity.itemEntity.Item;
import com.liuming.eshop.service.itemService.ItemService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description 商品
 * @ClassName ItemController
 * @Author 鲸落
 * @date 2019.11.11 14:33
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    /**
     * @Description 查询商品
     * @param pageNum
     * @param pageSize
     * @param item
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.14 17:36
     */
    @RequestMapping("/findItem")
    public DataResult findItem(@RequestParam(defaultValue = "1") int pageNum,
                               @RequestParam(defaultValue = "10") int pageSize, Item item){
        return itemService.findItem(pageNum, pageSize, item);
    }
}
