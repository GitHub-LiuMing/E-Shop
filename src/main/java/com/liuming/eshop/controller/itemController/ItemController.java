package com.liuming.eshop.controller.itemController;

import com.liuming.eshop.service.itemService.ItemService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description 
 * @ClassName ItemController
 * @Author 鲸落
 * @date 2019.11.11 14:33
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/findItemAll")
    public DataResult findItemAll(@RequestParam(defaultValue = "1") int pageNum,
                                  @RequestParam(defaultValue = "10") int pageSize){
        return itemService.findItemAll(pageNum, pageSize);
    }
}
