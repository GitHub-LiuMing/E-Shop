package com.liuming.eshop.service.provinceService.impl;

import com.liuming.eshop.entity.provinceEntity.Province;
import com.liuming.eshop.mapper.provinceMapper.ProvinceMapper;
import com.liuming.eshop.service.provinceService.ProvinceService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 
 * @ClassName ProvinceServiceImpl
 * @Author 鲸落
 * @date 2019.07.29 16:10
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public DataResult findProvince() {
        Map map = new HashMap();
        List<Province> provinceList = provinceMapper.findProvince(map);
        return DataResult.ok(provinceList);
    }
}
