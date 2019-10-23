package com.liuming.eshop.controller.pointsDetailsController;

import com.liuming.eshop.entity.pointsDetailsEntity.PointsDetails;
import com.liuming.eshop.service.pointsDetailsService.PointsDetailsService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 积分详情
 * @ClassName PointsDetailsController
 * @Author 鲸落
 * @date 2019.08.05 09:21
 */
@RestController
@RequestMapping("/pointsDetails")
public class PointsDetailsController {
    @Autowired
    private PointsDetailsService pointsDetailsService;

    /**
     * @Description 添加积分详情
     * @param pointsDetails
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.08.06 16:52
     */
    @RequestMapping("/addPointsDetails")
    public DataResult addPointsDetails(@RequestBody PointsDetails pointsDetails){
        return pointsDetailsService.addPointsDetails(pointsDetails);
    }
}
