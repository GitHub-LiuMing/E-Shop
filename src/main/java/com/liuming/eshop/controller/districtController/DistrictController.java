package com.liuming.eshop.controller.districtController;

import com.liuming.eshop.service.districtService.DistrictService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 
 * @ClassName DistrictController
 * @Author Ming Liu
 * @date 2019.07.31 19:17
 */
@RestController
@RequestMapping("/district")
public class DistrictController {
    @Autowired
    private DistrictService districtService;

    /**
     * @Description 查询区
     * @param cityCode 城市代码
     * @return com.liuming.eshop.utils.DataResult
     * @Author Ming Liu
     * @Date 2019.07.31 15:46
     */
    @RequestMapping("/findDistrict")
    public DataResult findDistrict(String cityCode){
        return districtService.findDistrict(cityCode);
    }
}
