package com.liuming.eshop.controller.cityController;

import com.liuming.eshop.service.cityService.CityService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 
 * @ClassName CityController
 * @Author Ming Liu
 * @date 2019.07.30 14:12
 */
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;

    /**
     * @Description 查询市
     * @param provinceCode 省份代码
     * @return com.liuming.eshop.utils.DataResult
     * @Author Ming Liu
     * @Date 2019.07.30 15:01
     */
    @RequestMapping("/findCity")
    public DataResult findCity(String provinceCode){
        return cityService.findCity(provinceCode);
    }
}
