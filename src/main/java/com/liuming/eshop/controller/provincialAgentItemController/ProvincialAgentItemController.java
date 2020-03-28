package com.liuming.eshop.controller.provincialAgentItemController;

import com.liuming.eshop.entity.provincialAgentItemEntity.ProvincialAgentItem;
import com.liuming.eshop.service.provincialAgentItemService.ProvincialAgentItemService;
import com.liuming.eshop.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 省代商品
 * @ClassName ProvincialAgentItemController
 * @Author 张孙峰
 * @date 2019.12.18 10:24
 */
@RestController
@RequestMapping("/provincialAgentItem")
public class ProvincialAgentItemController {
    @Resource
    private ProvincialAgentItemService provincialAgentItemService;

    /**
     * @param provincialAgentItem
     * @return com.liuming.eshop.utils.DataResult
     * @Description 新增省代商品
     * @Author 张孙峰
     * @Date 2019.12.18 10:30
     */
    @RequestMapping("/addProvincialAgentItem")
    public DataResult addProvincialAgentItem(ProvincialAgentItem provincialAgentItem) {
        if (StringUtils.isNotBlank(provincialAgentItem.getProvincialAgentId())
                && StringUtils.isNotBlank(provincialAgentItem.getProvincialAgentName())
                && StringUtils.isNotBlank(provincialAgentItem.getItemId())
                && StringUtils.isNotBlank(provincialAgentItem.getItemName())
                && provincialAgentItem.getProvincialAgentItemOriginalPrice() != null
                && provincialAgentItem.getProvincialAgentItemPresentPrice() != null
                && provincialAgentItem.getStockNum() != null
                && provincialAgentItem.getSalesNum() != null
                && provincialAgentItem.getProvincialAgentItemStatus() != null
                && provincialAgentItem.getProvincialAgentItemType() != null) {
            return provincialAgentItemService.addProvincialAgentItem(provincialAgentItem);
        } else {
            return DataResult.build(500, "省代ID、省代名称、商品ID、商品名称、商品原价、商品现价、库存数量、销量数量、商品状态、商品类型不得为空");
        }
    }

    /**
     * @param pageNum
     * @param pageSize
     * @param provincialAgentItem
     * @return com.liuming.eshop.utils.DataResult
     * @Description 查询省代商品
     * @Author 张孙峰
     * @Date 2019.12.18 11:29
     */
    @RequestMapping("/findProvincialAgentItem")
    public DataResult findProvincialAgentItem(@RequestParam(defaultValue = "1") int pageNum,
                                              @RequestParam(defaultValue = "10") int pageSize,
                                              ProvincialAgentItem provincialAgentItem) {
        return provincialAgentItemService.findProvincialAgentItem(pageNum, pageSize, provincialAgentItem);
    }

    @RequestMapping("/updateProvincialAgentItem")
    public DataResult updateProvincialAgentItem(ProvincialAgentItem provincialAgentItem){
        /**
         * @Description 修改省代商品
         * @param provincialAgentItem
         * @return com.liuming.eshop.utils.DataResult
         * @Author 鲸落
         * @Date 2020.01.17 15:54
         */
        if (StringUtils.isNotBlank(provincialAgentItem.getProvincialAgentItemId())){
            return provincialAgentItemService.updateProvincialAgentItem(provincialAgentItem);
        } else {
            return DataResult.build(500,"省代商品ID不得为空");
        }
    }
}
