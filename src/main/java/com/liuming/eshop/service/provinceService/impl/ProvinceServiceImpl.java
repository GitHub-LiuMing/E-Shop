package com.liuming.eshop.service.provinceService.impl;

import com.liuming.eshop.entity.provinceEntity.Province;
import com.liuming.eshop.mapper.province.ProvinceMapper;
import com.liuming.eshop.service.provinceService.ProvinceService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 
 * @ClassName ProvinceServiceImpl
 * @Author Ming Liu
 * @date 2019.07.29 16:10
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public DataResult findAll() {
        List<Province> provinceList = provinceMapper.findAll();
        return DataResult.ok(provinceList);
    }
}
