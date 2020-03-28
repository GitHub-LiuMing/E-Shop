package com.liuming.eshop.service.pointsService.impl;

import com.liuming.eshop.mapper.pointsMapper.PointsMapper;
import com.liuming.eshop.service.pointsService.PointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 
 * @ClassName PointsServiceImpl
 * @Author 张孙峰
 * @date 2019.08.03 15:06
 */
@Service
public class PointsServiceImpl implements PointsService {
    @Autowired
    private PointsMapper pointsMapper;
}
