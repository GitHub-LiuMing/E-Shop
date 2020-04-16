package com.liuming.eshop.service.pointsDetailsService;

import com.liuming.eshop.entity.pointsDetailsEntity.PointsDetails;
import com.liuming.eshop.utils.DataResult;

public interface PointsDetailsService {
    DataResult addPointsDetails(PointsDetails pointsDetails);

    DataResult findPointsDetails(String memberId);

    DataResult updatePointsDetails(PointsDetails pointsDetails);

    DataResult findPointsDetailsByAfter(String memberId);

    DataResult adjustPointsDetails(PointsDetails pointsDetails);
}
