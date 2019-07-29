package com.liuming.eshop.controller.provinceController;

import com.liuming.eshop.service.provinceService.ProvinceService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 省份
 * @ClassName ProvinceController
 * @Author Ming Liu
 * @date 2019.07.29 16:38
 */
@RestController
@RequestMapping("/province")
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @RequestMapping("/findAll")
    public DataResult findAll(){
        return provinceService.findAll();
    }
}
