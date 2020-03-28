package com.liuming.eshop.utils.payUtils;

public class Configure {

	//你的商户的api秘钥
	private static String key = "ShanXiShengShi8521XiAnMengLiFAng";

	//小程序ID	你的小程序id
	private static String appID = "wx5cc543458ee4cb71";
	
	//商户号
	private static String mch_id = "1515621381";
	
	//你的小程序的secret
	private static String secret = "2da77df4f4491c088eebcce690326c9b";

	private static final String notify_url = "http://39.98.199.139:80/pay/wx_notify_url";

	public static String getNotify_url() {
		return notify_url;
	}

	public static String getSecret() {
		return secret;
	}

	public static void setSecret(String secret) {
		Configure.secret = secret;
	}

	public static String getKey() {
		return key;
	}

	public static void setKey(String key) {
		Configure.key = key;
	}

	public static String getAppID() {
		return appID;
	}

	public static void setAppID(String appID) {
		Configure.appID = appID;
	}

	public static String getMch_id() {
		return mch_id;
	}

	public static void setMch_id(String mch_id) {
		Configure.mch_id = mch_id;
	}

}
