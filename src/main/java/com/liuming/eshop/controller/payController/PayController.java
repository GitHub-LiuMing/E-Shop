package com.liuming.eshop.controller.payController;

import com.liuming.eshop.entity.ordersEntity.Orders;
import com.liuming.eshop.service.ordersService.OrdersService;
import com.liuming.eshop.mapper.ordersMapper.OrdersMapper;
import com.liuming.eshop.service.payService.PayService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.payUtils.*;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.Null;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.*;

/**
 * @Description 支付
 * @ClassName PayController
 * @Author 鲸落
 * @date 2020.01.14 16:29
 */
@RestController
@RequestMapping("/pay")
public class PayController {
    @Resource
    private PayService payService;

    @Resource
    private OrdersService ordersService;

    @Resource
    private OrdersMapper ordersMapper;

    @RequestMapping("/toPay")
    public DataResult toPay(String ordersId){
        if (StringUtils.isNotBlank(ordersId)){
            return payService.toPay(ordersId);
        } else {
            return DataResult.build(500,"订单ID不得为空");
        }
    }

    /**
     * 去支付
     */
    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    @ResponseBody
    public DataResult findTransactionRecord(HttpServletRequest request, String ordersId,
                                            String openId) throws Exception {
        //查询订单
        Orders orders = ordersMapper.findOrdersId(ordersId);
        if (orders != null) {
            System.out.println(orders.getTotalPrice());
            // 拿到合计金额 格式化合计金额
            int total_fee = BigDecimal.valueOf(orders.getTotalPrice()).multiply(new BigDecimal(100)).intValue();

            System.out.println(total_fee);
            // 微信返回参数组
            Map<String, String> unifiedorder = unifiedorder(request, ordersId, total_fee, openId);
            //UnifiedorderResult unifiedorderResult = unifiedorder(bonusPoints.getBonusPointsId(), total_fee, openId);
            System.out.println(unifiedorder);
            return DataResult.ok(unifiedorder);
        } else {
            return DataResult.build(500,"订单不存在");
        }
    }

    /**
     * 发起支付
     *
     * @param out_trade_no
     * @param total_fee
     * @param openId
     * @return
     */
    private static Map<String, String> unifiedorder(HttpServletRequest request, String out_trade_no
            , int total_fee, String openId) throws Exception {
        Map<String, String> result = new HashMap();
        String nonce_str = RandomStringGenerator.getRandomStringByLength(32);
        TreeMap<String, String> packageParams = new TreeMap<>();
        packageParams.put("appid", Configure.getAppID().trim());
        packageParams.put("mch_id", Configure.getMch_id());
        packageParams.put("nonce_str", nonce_str);
        packageParams.put("body", "支付购买服务");
        packageParams.put("out_trade_no", out_trade_no);//商户订单号,自己的订单ID
        packageParams.put("total_fee", String.valueOf(total_fee) + "");//支付金额，这边需要转成字符串类型，否则后面的签名会失败
//			String.valueOf((int)Math.ceil(Double.valueOf(orderForm.getPayPrice())*100))
        packageParams.put("spbill_create_ip", IPAdrressUtils.getIPAdrress(request));//获取IP地址
        packageParams.put("notify_url", Configure.getNotify_url());//支付成功后的回调地址
        packageParams.put("trade_type", "JSAPI");//支付方式
        packageParams.put("openid", openId);
        String sign =
                WXPayUtil.generateSignature(packageParams, Configure.getKey());
        packageParams.put("sign", sign);

        WXPayUtil w = new WXPayUtil();
        Map<String, String> resp = w.unifiedOrder(packageParams, Configure.getKey(), 500, 500);
        JSONObject jsonObject = JSONObject.fromObject(resp);
        System.out.println(jsonObject);
        String packages = "prepay_id=" + jsonObject.get("prepay_id");
        SortedMap<String, String> finalpackage = new TreeMap<String, String>();
        finalpackage.put("appId", Configure.getAppID());
        finalpackage.put("timeStamp", nonce_str);
        finalpackage.put("nonceStr", nonce_str);
        finalpackage.put("package", packages);
        finalpackage.put("signType", "MD5");
        String paySign = WXPayUtil.generateSignature(finalpackage, Configure.getKey());
        finalpackage.put("paySign", paySign);

        result = finalpackage;
        return result;
    }

    /**
     * 微信支付回调
     *
     * @param //request
     */
    @RequestMapping(value = "/wx_notify_url")
    public void notifyWeixinPayment(HttpServletRequest request, HttpServletResponse response) {
        try {
            System.out.println("----[接收到微信回调success]----");

            BufferedReader reader = request.getReader();
            String line = "";
            StringBuffer inputString = new StringBuffer();
            try {
                PrintWriter writer = response.getWriter();
                while ((line = reader.readLine()) != null) {
                    inputString.append(line);
                }
                if (reader != null) {
                    reader.close();
                }
                System.out.println("----[微信回调]接收到的报文---" + inputString.toString());
                if (!StringUtils.isEmpty(inputString.toString())) {
                    String json = XmlJsonUtil.xml2JSON(inputString.toString());
                    WXPayResult wxPayResult = JsonUtils.jsonToPojo(json, WXPayResult.class);
                    System.out.println(JsonUtils.objectToJson(wxPayResult));
                    if (wxPayResult.getReturn_code().toLowerCase().contains("SUCCESS".toLowerCase())) {
//						 logger.info("微信支付成功了");
                        System.out.println("微信支付成功了");
                        SortedMap<Object, Object> parameters = new TreeMap<Object, Object>();
                        parameters.put("appid", wxPayResult.getAppid());
                        parameters.put("attach", wxPayResult.getAttach());
                        parameters.put("bank_type", wxPayResult.getBank_type());
                        parameters.put("cash_fee", wxPayResult.getCash_fee());
                        parameters.put("fee_type", wxPayResult.getFee_type());
                        parameters.put("is_subscribe", wxPayResult.getIs_subscribe());
                        parameters.put("mch_id", wxPayResult.getMch_id());
                        parameters.put("nonce_str", wxPayResult.getNonce_str());
                        parameters.put("openid", wxPayResult.getOpenid());
                        parameters.put("out_trade_no", wxPayResult.getOut_trade_no());
                        parameters.put("result_code", wxPayResult.getResult_code());
                        parameters.put("return_code", wxPayResult.getReturn_code());
                        parameters.put("time_end", wxPayResult.getTime_end());
                        parameters.put("total_fee", wxPayResult.getTotal_fee());
                        parameters.put("trade_type", wxPayResult.getTrade_type());
                        parameters.put("transaction_id", wxPayResult.getTransaction_id());

                        System.out.println("------111-------");

                        //查询订单
                        Orders orders = ordersMapper.findOrdersId(wxPayResult.getOut_trade_no());

                        System.out.println("Cash_fee: " + wxPayResult.getCash_fee());
                        System.out.println("orders: " + orders);
                        if (orders != null){
                            //判断得到的金额和查询的金额是否相同，查询的金额是分为单位
                            if (wxPayResult.getCash_fee() == orders.getTotalPrice().doubleValue() * 100) {

                                System.out.println("----------订单校验成功----------");
                                //修改订单的支付参数
                                orders.setPayType(0);
                                orders.setPayPrice((double)wxPayResult.getCash_fee()/100);
                                orders.setOrdersStatus(2);
                                orders.setPayResul(1);
                                orders.setOrdersUpdateDate(new Date());

                                int i = ordersMapper.updateByPrimaryKeySelective(orders);
                                if (i >= 1){
                                    writer.write(setXml("SUCCESS", "OK"));
                                    System.out.println("------------支付成功-------------");
                                } else {
                                    writer.write(setXml("FAIL", "Update data timeout"));
                                    System.out.println("----------- 更新数据失败,请重试-------------");
                                }
                            } else {
                                writer.write(setXml("FAIL", "Different amounts"));
                            }
                        } else {
                            writer.write(setXml("FAIL", "No results returned by OrdersID"));
                        }
                    } else {
                        writer.write(setXml("FAIL", wxPayResult.getReturn_msg()));
                        System.out.println("---------微信支付返回Fail----------" + wxPayResult.getReturn_msg());
                    }
                    if (writer != null) {
                        writer.close();
                    }
                } else {
                    writer.write(setXml("FAIL", "No results returned by WeChat"));
                    System.out.println("----------------未获得到微信返回的结果------------------");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String setXml(String return_code, String return_msg) {
        return "<xml><return_code><![CDATA[" + return_code + "]]></return_code><return_msg><![CDATA[" + return_msg
                + "]]></return_msg></xml>";
    }
}
