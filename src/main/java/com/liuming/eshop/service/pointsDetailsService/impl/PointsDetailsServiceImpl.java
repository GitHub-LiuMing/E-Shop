package com.liuming.eshop.service.pointsDetailsService.impl;

import com.liuming.eshop.entity.pointsDetailsEntity.PointsDetails;
import com.liuming.eshop.mapper.pointsDetailsMapper.PointsDetailsMapper;
import com.liuming.eshop.service.pointsDetailsService.PointsDetailsService;
import com.liuming.eshop.utils.CheckObjectIsNullUtils;
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
 * @Author 鲸落
 * @date 2019.08.05 09:22
 */
@Service
public class PointsDetailsServiceImpl implements PointsDetailsService {
    @Resource
    private PointsDetailsMapper pointsDetailsMapper;

    @Override
    public DataResult addPointsDetails(PointsDetails pointsDetails) {
        CheckObjectIsNullUtils checkObjectIsNullUtils = new CheckObjectIsNullUtils();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (StringUtils.isNotBlank(pointsDetails.getMemberId()) ) {
            if (pointsDetails.getPointsDetailsType() != null){
                //&& StringUtils.isNotBlank(pointsDetails.getWechatName()) && StringUtils.isNotBlank(pointsDetails.getPhone())
                //先查询该用户最后一条数据中的变动后的积分,如果是第一条数据,就将变动前的积分设定为0,然后插入表
                Map pointsDetailsDescLimit1Map = new HashMap();
                pointsDetailsDescLimit1Map.put("memberId", pointsDetails.getMemberId());
                PointsDetails pointsDetailsDescLimit1 = pointsDetailsMapper.findPointsDetailsDescLimit1(pointsDetailsDescLimit1Map);
                if (pointsDetailsDescLimit1 != null){
                    List<PointsDetails> pointsDetailsList = pointsDetailsMapper.findPointsDetailsByidAndtoDays(pointsDetails.getMemberId(),
                            simpleDateFormat.format(new Date()));
                    if (pointsDetailsList.size() == 0){
                        pointsDetails.setPointsDetailsId(IDUtils.getId());
                        pointsDetails.setBeforeModifyPoints(pointsDetailsDescLimit1.getAfterModifyPoints());
                        pointsDetails.setPointsDetailsType(pointsDetails.getPointsDetailsType());
                        if (pointsDetails.getPointsDetailsType() == 0){
                            //0-签到 "签到送积分"
                            pointsDetails.setModifyPoints(1);
                            pointsDetails.setAfterModifyPoints(pointsDetailsDescLimit1.getAfterModifyPoints() + pointsDetails.getModifyPoints());
                            pointsDetails.setPointsDetailsDetails("签到送积分");
                            pointsDetails.setRemark(simpleDateFormat.format(new Date()) + " 签到送积分");
                        } else if (pointsDetails.getPointsDetailsType() == 1){
                            //1-订单 "订单"+订单号+"兑换积分"
                            pointsDetails.setModifyPoints(2);
                            pointsDetails.setAfterModifyPoints(pointsDetailsDescLimit1.getAfterModifyPoints() + pointsDetails.getModifyPoints());
                            pointsDetails.setPointsDetailsDetails(pointsDetails.getPointsDetailsDetails());
                            pointsDetails.setRemark("购物消费");
                        }
                        pointsDetails.setPointsDetailsStatus(1);
                        pointsDetails.setPointsDetailsCreatedDate(new Date());
                        pointsDetails.setPointsDetailsUpdatedDate(new Date());
                        pointsDetailsMapper.insertSelective(pointsDetails);
                        return DataResult.ok(pointsDetailsDescLimit1);
                    } else {
                        return DataResult.build(500,"您今天已经签到了，请休息一下，明天再来");
                    }
                } else {
                    pointsDetails.setPointsDetailsId(IDUtils.getId());
                    pointsDetails.setBeforeModifyPoints(0);
                    pointsDetails.setPointsDetailsType(pointsDetails.getPointsDetailsType());
                    if (pointsDetails.getPointsDetailsType() == 0){
                        //0-签到 "签到送积分"
                        pointsDetails.setModifyPoints(pointsDetails.getModifyPoints());
                        pointsDetails.setAfterModifyPoints(pointsDetails.getModifyPoints());
                        pointsDetails.setPointsDetailsDetails("签到送积分");
                        pointsDetails.setRemark(simpleDateFormat.format(new Date()) + " 签到送积分");
                    } else if (pointsDetails.getPointsDetailsType() == 1){
                        //1-订单 "订单"+订单号+"兑换积分"
                        pointsDetails.setModifyPoints(pointsDetails.getModifyPoints());
                        pointsDetails.setAfterModifyPoints(pointsDetails.getModifyPoints());
                        pointsDetails.setPointsDetailsDetails(pointsDetails.getPointsDetailsDetails());
                        pointsDetails.setRemark("购物消费");
                    }
                    pointsDetails.setPointsDetailsStatus(1);
                    pointsDetails.setPointsDetailsCreatedDate(new Date());
                    pointsDetails.setPointsDetailsUpdatedDate(new Date());
                    pointsDetailsMapper.insertSelective(pointsDetails);
                    return DataResult.ok(pointsDetailsDescLimit1);
                }
            }
            return DataResult.build(500, "积分类型不得为空");
        }
        return DataResult.build(500, "用户信息获取失败");
    }

    @Override
    public DataResult adjustPointsDetails(PointsDetails pointsDetails) {
        CheckObjectIsNullUtils checkObjectIsNullUtils = new CheckObjectIsNullUtils();
        if (StringUtils.isNotBlank(pointsDetails.getMemberId()) ) {
            if (pointsDetails.getPointsDetailsType() != null){
                //先查询该用户最后一条数据中的变动后的积分,如果是第一条数据,就将变动前的积分设定为0,然后插入表
                Map pointsDetailsDescLimit1Map = new HashMap();
                pointsDetailsDescLimit1Map.put("memberId", pointsDetails.getMemberId());
                PointsDetails pointsDetailsDescLimit1 = pointsDetailsMapper.findPointsDetailsDescLimit1(pointsDetailsDescLimit1Map);
                if (pointsDetailsDescLimit1 != null){
                    pointsDetails.setPointsDetailsId(IDUtils.getId());
                    //todo: 上线前最好加上微信昵称和手机号码字段
                    pointsDetails.setBeforeModifyPoints(pointsDetailsDescLimit1.getAfterModifyPoints());
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    pointsDetails.setModifyPoints(pointsDetails.getModifyPoints());
                    pointsDetails.setAfterModifyPoints(pointsDetailsDescLimit1.getAfterModifyPoints() + pointsDetails.getModifyPoints());
                    pointsDetails.setPointsDetailsDetails("管理员调整积分");
                    pointsDetails.setRemark(simpleDateFormat.format(new Date()) + "管理员调整积分");
                    pointsDetails.setPointsDetailsType(2);
                    pointsDetails.setPointsDetailsStatus(1);
                    pointsDetails.setPointsDetailsCreatedDate(new Date());
                    pointsDetails.setPointsDetailsUpdatedDate(new Date());
                    pointsDetailsMapper.insertSelective(pointsDetails);
                    return DataResult.ok(pointsDetailsDescLimit1);
                } else {
                    pointsDetails.setPointsDetailsId(IDUtils.getId());
                    pointsDetails.setBeforeModifyPoints(0);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    pointsDetails.setModifyPoints(pointsDetails.getModifyPoints());
                    pointsDetails.setAfterModifyPoints(0 + pointsDetails.getModifyPoints());
                    pointsDetails.setPointsDetailsDetails("管理员调整积分");
                    pointsDetails.setRemark(simpleDateFormat.format(new Date()) + " 管理员调整积分");
                    pointsDetails.setPointsDetailsType(2);
                    pointsDetails.setPointsDetailsStatus(1);
                    pointsDetails.setPointsDetailsCreatedDate(new Date());
                    pointsDetails.setPointsDetailsUpdatedDate(new Date());
                    pointsDetailsMapper.insertSelective(pointsDetails);
                    return DataResult.ok(pointsDetailsDescLimit1);
                }
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

    @Override
    public DataResult updatePointsDetails(PointsDetails pointsDetails) {
        return null;
    }

    public static void main(String[] args) {
        Date time = Calendar.getInstance().getTime();
        System.out.println(time + "");

        System.out.println(new Date());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
    }

    @Override
    public DataResult findPointsDetailsByAfter(String memberId) {
        PointsDetails pointsDetailsMax = pointsDetailsMapper.findPointsDetailsByAfter(memberId);
        return DataResult.ok(pointsDetailsMax);
    }

    @Override
    public DataResult findPointsDetailsByIdAndToDays(String memberId) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<PointsDetails> pointsDetailsList = pointsDetailsMapper.findPointsDetailsByidAndtoDays(memberId,
                simpleDateFormat.format(new Date()));
        if (pointsDetailsList.size() == 0){
            //还没有签到
            return DataResult.ok("1");
        } else {
            //已经签到了
            return DataResult.ok("0");
        }
    }
}
