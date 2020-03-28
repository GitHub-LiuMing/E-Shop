package com.liuming.eshop.utils.payUtils;

import lombok.Data;

/**
 * 微信支付结果返回的参数
 * Copyright © 2016 绿闪电科技
 * @date: 2016年11月2日 下午12:03:28
 * @author: XianGuo
 */
@Data
public class WXPayResult {
	private String appid;//公众账号ID
	private String mch_id;//微信支付分配的商户号
	private String device_info;//微信支付分配的终端设备号，
	private String nonce_str;//随机字符串，32位：数字+大写字母组合
	private String sign;//签名：回调的时候需要反校验
	private String result_code;//SUCCESS/FAIL
	private String err_code;//错误返回的信息描述
	private String err_code_des;//错误返回的信息描述
	private String openid;//用户在商户appid下的唯一标识
	private String is_subscribe;//用户是否关注公众账号，Y-关注，N-未关注，仅在公众账号类型支付有效
	private String trade_type;//交易类型:JSAPI、NATIVE、APP
	private String bank_type;//银行类型:ICBC_DEBIT:工商银行（借记卡）;ICBC_CREDIT:工商银行（信用卡）;
	private int total_fee;//订单总金额，单位为分;1元=100分；
	private String fee_type;//货币种类，符合ISO4217标准的三位字母代码，默认人民币：CNY
	private int cash_fee;//实际支付：现金支付金额订单现金支付金额
	private String cash_fee_type;//货币类型，符合ISO4217标准的三位字母代码，默认人民币：CNY
	private int coupon_fee;//优惠券总金额：代金券或立减优惠金额<=订单总金额，订单总金额-代金券或立减优惠金额=现金支付金额
	private int coupon_count;//优惠券的数量：1张
	private String coupon_id_0;//代金券或立减优惠ID,$n为下标，从0开始编号;目前一个订单只能用一张优惠券，(后面需要延伸的话，加参数)
	private int coupon_fee_0;//单个代金券或立减优惠支付金额,$n为下标，从0开始编号
	private String transaction_id;//微信支付订单号:1217752501201407033233368018
	private String out_trade_no;//商户系统的订单号，与请求一致。交易单号：1212321211201407033568112322
	private String attach;//商家数据包，原样返回:比如阿迪达斯的篮球鞋，白色，35
	private String time_end;//支付完成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010
	private String return_code;//SUCCESS/FAIL 此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
	private String return_msg;//返回信息，如非空，为错误原因
}
