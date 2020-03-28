package com.liuming.eshop.service.cityService.impl;

import com.liuming.eshop.entity.cityEntity.City;
import com.liuming.eshop.mapper.cityMapper.CityMapper;
import com.liuming.eshop.service.cityService.CityService;
import com.liuming.eshop.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 
 * @ClassName CityServiceImpl
 * @Author 张孙峰
 * @date 2019.07.30 14:14
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;

    @Override
    public DataResult findCity(String provinceCode) {
        Map map = new HashMap();
        if (StringUtils.isNotBlank(provinceCode)){
            map.put("provinceCode", provinceCode);
        }
        List<City> cityList = cityMapper.findCity(map);
        return DataResult.ok(cityList);
    }
}
