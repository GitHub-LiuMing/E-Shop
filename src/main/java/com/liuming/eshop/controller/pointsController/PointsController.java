package com.liuming.eshop.controller.pointsController;

import com.liuming.eshop.service.pointsService.PointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 
 * @ClassName PointsController
 * @Author 鲸落
 * @date 2019.08.03 15:06
 */
@RestController
@RequestMapping("/points")
public class PointsController {
    @Autowired
    private PointsService pointsService;
}
