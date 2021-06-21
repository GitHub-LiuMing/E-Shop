package com.liuming.eshop.controller.ordersController;

import com.arronlong.httpclientutil.HttpClientUtil;
import com.arronlong.httpclientutil.common.HttpConfig;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.liuming.eshop.entity.ordersEntity.Orders;
import com.liuming.eshop.entity.ordersEntity.OrdersWithBLOBs;
import com.liuming.eshop.entity.pointsEntity.Points;
import com.liuming.eshop.mapper.ordersMapper.OrdersMapper;
import com.liuming.eshop.service.ordersService.OrdersService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import com.liuming.eshop.utils.payUtils.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

/**
 * @Description 订单
 * @ClassName OrdersController
 * @Author 鲸落
 * @date 2020.01.07 15:17
 */
@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Resource
    private OrdersService ordersService;

    @Resource
    private OrdersMapper ordersMapper;

    /**
     * @Description 新增订单
     * @param orders
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.01.07 15:58
     */
    @RequestMapping("/addOrders")
    public DataResult addOrders(OrdersWithBLOBs orders) {
        if (StringUtils.isNotBlank(orders.getItemId()) && StringUtils.isNotBlank(orders.getMemberId()) && StringUtils.isNotBlank(orders.getCommissionId()) && orders.getItemNum() != null) {
            return ordersService.addOrders(orders);
        } else {
            return DataResult.build(500, "商品ID、会员ID、佣金ID不得为空");
        }
    }

    /**
     * @Description 添加积分兑换商品订单
     * @param orders
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.04.15 10:08
     */
    @RequestMapping("/addOrdersByPoints")
    public DataResult addOrdersByPoints(OrdersWithBLOBs orders){
        if (StringUtils.isNotBlank(orders.getItemId()) && StringUtils.isNotBlank(orders.getMemberId()) && StringUtils.isNotBlank(orders.getCommissionId()) && orders.getItemNum() != null) {
            return ordersService.addOrdersByPoints(orders);
        } else {
            return DataResult.build(500, "商品ID、会员ID、佣金ID不得为空");
        }
    }

    /**
     * @Description 查询订单
     * @param orders
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.01.13 15:24
     */
    @RequestMapping("/findOrders")
    public DataResult findOrders(OrdersWithBLOBs orders){
        return ordersService.findOrders(orders);
    }

    @RequestMapping("/updateOrders")
    public DataResult updateOrders(OrdersWithBLOBs orders){
        if (StringUtils.isNotBlank(orders.getOrdersId())){
            return ordersService.updateOrders(orders);
        } else {
            return DataResult.build(500,"订单ID不得为空");
        }
    }

    /**
     * @Description 调用快递100查询快递信息（了解实现流程）
     * @param com
     * @param num
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.04.17 11:50
     */
    @RequestMapping("/findCourier")
    public DataResult findCourier(String com, String num) throws Exception {
        String customer = "8582FDD72894805968ED1108CA9B65A0";
        String key = "sZsvbvYv4318";

        String param = "{\"com\":\"" + com + "\",\"num\":\"" + num + "\"}";
        String sign = MD5Util.MD5Encode(param + key + customer, "").toUpperCase();
        Map params = new HashMap();
        params.put("param", param);
        params.put("sign", sign);
        params.put("customer", customer);
        HttpConfig config = HttpConfig.custom().url("https://poll.kuaidi100.com/poll/query.do").map(params);
        String resp = HttpClientUtil.post(config);
        return DataResult.ok(resp);
    }

    private ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("thread-call-runner-%d").build();
    private ExecutorService taskExe = new ThreadPoolExecutor(1,20,200L,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(),namedThreadFactory);

    /**
     * @Description 定时增加评论（每次服务器重启，都需要执行该代码）（熟悉定时任务流程）
     * @return void
     * @Author 鲸落
     * @Date 2020.04.23 11:04
     */
    @RequestMapping("/scheduledTask")
    public void scheduledTask(){
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("启动更新订单未评论线程");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                calendar.add(Calendar.DATE, -7);
                List<OrdersWithBLOBs> ordersWithBLOBsList = ordersMapper.findOrdersByIsNullMCAndToDays(simpleDateFormat.format(calendar.getTime()));
                System.out.println("查询到 "+ordersWithBLOBsList.size()+" 个到期未评论订单");
                if (ordersWithBLOBsList.size() > 0){
                    for (OrdersWithBLOBs ordersWithBLOBs : ordersWithBLOBsList) {
                        ordersWithBLOBs.setMemberComment("产品效果很好，物流很快，赞一个");
                        ordersWithBLOBs.setOrdersUpdateDate(new Date());
                        ordersMapper.updateByPrimaryKeyWithBLOBs(ordersWithBLOBs);
                    }
                }
            }
        };
        //scheduleWithFixedDelay(Runnable command(计时器任务), long initialDelay(初始延迟), long delay(延迟), TimeUnit unit(运行时间))
        scheduledExecutorService.scheduleWithFixedDelay(task, 0, 24, TimeUnit.HOURS);
        //scheduledExecutorService.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);
        //scheduledExecutorService.shutdown();
    }
}
