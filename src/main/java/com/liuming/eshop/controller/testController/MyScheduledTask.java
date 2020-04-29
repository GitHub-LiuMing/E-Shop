package com.liuming.eshop.controller.testController;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.liuming.eshop.entity.pointsDetailsEntity.PointsDetails;
import com.liuming.eshop.entity.pointsEntity.Points;
import com.liuming.eshop.mapper.pointsMapper.PointsMapper;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

/**
 * @Description 测试定时任务
 * @ClassName MyScheduledTask
 * @Author 鲸落
 * @date 2020.03.23 11:14
 */
//@Component
@RestController
@RequestMapping("/t")
public class MyScheduledTask {
    //@Scheduled(cron = "*/5 * * * * ?")
    /*public void sc1(){
        System.out.println("测试定时任务");
    }*/
    private ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("thread-call-runner-%d").build();
    private ExecutorService taskExe = new ThreadPoolExecutor(1,20,200L,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(),namedThreadFactory);

    @Resource
    private PointsMapper pointsMapper;

    @RequestMapping("/ts")
    public void t(String memberId){
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("新增前");
                Points points = new Points();
                points.setPointsId(IDUtils.getId());
                points.setPointsRegulation(0);
                points.setPoints(3);
                points.setPointsStatus(1);
                points.setPointsCreatedDate(new Date());
                points.setPointsUpdatedDate(new Date());
                //pointsMapper.insertSelective(points);
                System.out.println("新增后");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                calendar.add(Calendar.DATE, -1);
                List<Points> pointsList = pointsMapper.findPointsDetailsByidAndtoDays(simpleDateFormat.format(calendar.getTime()));
                //List<Points> pointsList = pointsMapper.findPoints();
                System.out.println("新增后"+pointsList.size()+"个");
                for (Points points1 : pointsList) {
                    points1.setPointsCreatedDate(new Date());
                    pointsMapper.updateByPrimaryKeySelective(points1);
                }
            }
        };
        scheduledExecutorService.scheduleWithFixedDelay(task, 0, 5, TimeUnit.SECONDS);
    }
}
