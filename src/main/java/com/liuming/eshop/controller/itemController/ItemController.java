package com.liuming.eshop.controller.itemController;

import com.liuming.eshop.entity.itemEntity.Item;
import com.liuming.eshop.service.itemService.ItemService;
import com.liuming.eshop.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 商品
 * @ClassName ItemController
 * @Author 张孙峰
 * @date 2019.11.11 14:33
 */
@RestController
@RequestMapping("/item")
public class ItemController {
    @Resource
    private ItemService itemService;

    /**
     * @Description 新增商品
     * @param item
     * @return com.liuming.eshop.utils.DataResult
     * @Author 张孙峰
     * @Date 2019.12.17 15:12
     */
    @RequestMapping("/addItem")
    public DataResult addItem(Item item) {
        if (StringUtils.isNotBlank(item.getItemName())
                && StringUtils.isNotBlank(item.getClassifyId())
                //&& StringUtils.isNotBlank(item.getCommissionId())
                && StringUtils.isNotBlank(item.getLogisticsTemplateId())
                && item.getItemOriginalPrice() != null
                && item.getItemPresentPrice() != null
                && item.getItemStatus() != null) {
            return itemService.addItem(item);
        } else {
            return DataResult.build(500, "商品名称、分类ID、佣金ID、物流模板ID、商品原价、商品现价、商品状态不得为空");
        }
    }

    /**
     * @Description 查询商品
     * @param pageNum
     * @param pageSize
     * @param item
     * @return com.liuming.eshop.utils.DataResult
     * @Author 张孙峰
     * @Date 2019.12.14 17:36
     */
    @RequestMapping("/findItem")
    public DataResult findItem(@RequestParam(defaultValue = "1") int pageNum,
                               @RequestParam(defaultValue = "10") int pageSize, Item item) {
        return itemService.findItem(pageNum, pageSize, item);
    }

    /**
     * @Description 修改商品
     * @param item
     * @return com.liuming.eshop.utils.DataResult
     * @Author 张孙峰
     * @Date 2020.01.04 11:12
     */
    @RequestMapping("/updateItem")
    public DataResult updateItem(Item item){
        if (StringUtils.isNotBlank(item.getItemId())){
            return itemService.updateItem(item);
        } else {
            return DataResult.build(500,"商品获取失败");
        }
    }
}
