package com.liuming.eshop.service.provinceService.impl;

import com.liuming.eshop.entity.provinceEntity.Province;
import com.liuming.eshop.mapper.provinceMapper.ProvinceMapper;
import com.liuming.eshop.service.provinceService.ProvinceService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        List<Province> provinceList = provinceMapper.findProvince();
        return DataResult.ok(provinceList);
    }
}
