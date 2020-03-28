package com.liuming.eshop.service.pointsDetailsService.impl;

import com.liuming.eshop.entity.pointsDetailsEntity.PointsDetails;
import com.liuming.eshop.mapper.pointsDetailsMapper.PointsDetailsMapper;
import com.liuming.eshop.service.pointsDetailsService.PointsDetailsService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description 积分详情
 * @ClassName PointsDetailsServiceImpl
 * @Author 张孙峰
 * @date 2019.08.05 09:22
 */
@Service
public class PointsDetailsServiceImpl implements PointsDetailsService {
    @Resource
    private PointsDetailsMapper pointsDetailsMapper;

    @Override
    public DataResult addPointsDetails(PointsDetails pointsDetails) {
        if (StringUtils.isNotBlank(pointsDetails.getMemberId()) ) {
            if (pointsDetails.getPointsDetailsType() != null){
                //&& StringUtils.isNotBlank(pointsDetails.getWechatName()) && StringUtils.isNotBlank(pointsDetails.getPhone())
                //先查询该用户最后一条数据中的变动后的积分,如果是第一条数据,就将变动前的积分设定为0,然后插入表
                Map pointsDetailsDescLimit1Map = new HashMap();
                pointsDetailsDescLimit1Map.put("memberId", pointsDetails.getMemberId());
                PointsDetails pointsDetailsDescLimit1 = pointsDetailsMapper.findPointsDetailsDescLimit1(pointsDetailsDescLimit1Map);

                pointsDetails.setPointsDetailsId(IDUtils.getId());
                pointsDetails.setBeforeModifyPoints(pointsDetailsDescLimit1.getAfterModifyPoints());
                pointsDetails.setModifyPoints(0);
                pointsDetails.setAfterModifyPoints(pointsDetailsDescLimit1.getAfterModifyPoints() + pointsDetails.getModifyPoints());
                pointsDetails.setPointsDetailsType(pointsDetails.getPointsDetailsType());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                if (pointsDetails.getPointsDetailsType() == 0){
                    //0-签到 "签到送积分"
                    pointsDetails.setPointsDetailsDetails("签到送积分");
                    pointsDetails.setRemark(simpleDateFormat.format(new Date()) + " 签到送积分");
                } else if (pointsDetails.getPointsDetailsType() == 1){
                    //1-订单 "订单"+订单号+"兑换积分"
                    pointsDetails.setPointsDetailsDetails(pointsDetails.getPointsDetailsDetails());
                    pointsDetails.setRemark("购物消费");
                }
                pointsDetails.setPointsDetailsStatus(1);
                pointsDetails.setPointsDetailsCreatedDate(new Date());
                pointsDetails.setPointsDetailsUpdatedDate(new Date());
                return DataResult.ok(pointsDetailsDescLimit1);
            }
            return DataResult.build(500, "积分类型不得为空");
        }
        return DataResult.build(500, "用户信息获取失败");
    }

    @Override
    public DataResult findPointsDetails(String memberId) {
        Map map = new HashMap();
        map.put("memberId", memberId);
        List<PointsDetails> pointsDetailsList = pointsDetailsMapper.findPointsDetails(map);
        return DataResult.ok(pointsDetailsList);
    }

    public static void main(String[] args) {
        Date time = Calendar.getInstance().getTime();
        System.out.println(time + "");

        System.out.println(new Date());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
    }
}
