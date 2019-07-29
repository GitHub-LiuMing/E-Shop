package com.liuming.eshop.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @Description ID生成工具类
 * @ClassName IDUtils
 * @author Ming Liu
 * @date 2018.03.01 10:47:38
 */
public class IDUtils {

	/**
	 * @Description 图片名生成 yyyyMMddHHmmssSSS + 4位随机数
	 * @Title getImageName
	 * @return String
	 * @author 炸了毛的猫
	 * @date 2018.03.02 10:49:40
	 */
	public static String getImageName() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String date = sdf.format(new Date());
		// 加上三位随机数
		Random random = new Random();
		int end3 = random.nextInt(999);
		// 如果不足三位前面补0
		String str = date + String.format("%03d", end3);

		return str;
	}

	/**
	 * @Description ID生成
	 * @Title getDataId
	 * @return long
	 * @author 炸了毛的猫
	 * @date 2018.03.02 10:49:59
	 */
	public static long getDataId() {
		// 取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		// long millis = System.nanoTime();
		// 加上两位随机数
		Random random = new Random();
		int end4 = random.nextInt(9999);
		// 如果不足两位前面补0
		String str = millis + String.format("%04d", end4);
		long id = new Long(str);
		return id;
	}

	public static long getTimestamp() {
		// 取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		// long millis = System.nanoTime();
		// 加上两位随机数
		Random random = new Random();
		int end4 = random.nextInt(9999);
		// 如果不足两位前面补0
		String str = millis + String.format("%04d", end4);
		long id = new Long(str);
		return id;
	}

	/**
	 * @Description ID生成 yyyyMMddHHmmssSSS+4位随机数
	 * @Title getId
	 * @return String
	 * @author Ming Liu
	 * @date 2018.03.02 10:50:29
	 */
	public static String getId() {
		// 取当前时间包含毫秒
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String date = sdf.format(new Date());
		// 加上4位随机数
		Random random = new Random();
		int end4 = random.nextInt(9999);
		// 如果不足两位前面补0
		return date + String.format("%04d", end4);
	}
	
	public static String getDateId() {
		// 取当前时间包含毫秒
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String date = sdf.format(new Date());
		// 加上4位随机数
		Random random = new Random();
		int end2 = random.nextInt(99);
		// 如果不足两位前面补0
		return date + String.format("%02d", end2);
	}

	public static String getBatchNo() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String date = sdf.format(new Date());
		return date+"";
	}

	public static void main(String[] args) {
		// 取当前时间包含毫秒
		String batchNo = getBatchNo();
		System.out.println(batchNo);
	}
}
