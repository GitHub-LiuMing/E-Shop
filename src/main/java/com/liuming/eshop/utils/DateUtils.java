package com.liuming.eshop.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Description 日期工具类
 * @ClassName DateUtils
 * @author 鲸落
 * @date 2018.03.03 10:38:01
 */
public class DateUtils {
	/**
	 * @Description 日期 加|减 年数
	 * @Title dateAddYear
	 * @param date
	 * @param value
	 * @return String
	 * @author 鲸落
	 * @date 2018.03.02 10:38:27
	 */
	public static String dateAddYear(Date date, int value) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.add(Calendar.YEAR, -1);// 日期减1年
		rightNow.add(Calendar.MONTH, 3);// 日期加3个月
		rightNow.add(Calendar.DAY_OF_YEAR, 10);// 日期加10天
		Date dt1 = rightNow.getTime();
		String reStr = sdf.format(dt1);
		return reStr;
	}

	/**
	 * @Description 日期 加|减 月数
	 * @Title dateAddMonth
	 * @param date
	 * @param value
	 * @return Date
	 * @author 鲸落
	 * @date 2018.03.02 10:38:38
	 */
	public static Date dateAddMonth(Date date, int value) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		// rightNow.add(Calendar.YEAR, -1);// 日期减1年
		rightNow.add(Calendar.MONTH, value);// 日期加3个月
		// rightNow.add(Calendar.DAY_OF_YEAR, 10);// 日期加10天
		Date dt1 = rightNow.getTime();
		String reStr = sdf.format(dt1);
		return dt1;
	}

	/**
	 * @Description 日期 加|减 天数
	 * @Title dateAddDay
	 * @param date
	 * @param value
	 * @return Date
	 * @author 鲸落
	 * @date 2018.03.02 10:38:51
	 */
	public static Date dateAddDay(Date date, int value) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		// rightNow.add(Calendar.YEAR, -1);// 日期减1年
		// rightNow.add(Calendar.MONTH, 3);// 日期加3个月
		rightNow.add(Calendar.DAY_OF_YEAR, value);// 日期加10天
		Date dt1 = rightNow.getTime();
		String reStr = sdf.format(dt1);
		return dt1;
	}

	public static String dayAdd(String time, int addSum) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String format = "";
		try {
			Date myDate = formatter.parse(time);
			Calendar c = Calendar.getInstance();
			c.setTime(myDate);
			c.add(Calendar.DATE, addSum);
			myDate = c.getTime();
			format = formatter.format(myDate);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return format;
	}

	/**
	 * @Description 
	 * @Title dateMinus
	 * @param dateNew
	 * @param datePast
	 * @return long
	 * @author 鲸落
	 * @date 2018.03.02 10:39:03
	 */
	public static long dateMinus(Date dateNew, Date datePast) {
		long format = 0;
		try {
			format = (dateNew.getTime() - datePast.getTime()) / (1000 * 60);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return format;
	}

	public static int getMonthSpace(String date1, String date2) throws ParseException {
		int result = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(sdf.parse(date1));
		c2.setTime(sdf.parse(date2));
		result = c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
		return result == 0 ? 1 : Math.abs(result);
	}
	
	/**
	 * @Description 两个日期相减,获得天数
	 * @Title getTwoDay
	 * @param begin_date
	 * @param end_date
	 * @return long
	 * @author 鲸落
	 * @date 2018.03.02 10:39:12
	 */
	public static long getTwoDay(Date begin_date, Date end_date) {
		long day = 0;
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String sdate = format.format(Calendar.getInstance().getTime());

			if (begin_date == null) {
				begin_date = format.parse(sdate);
			}
			if (end_date == null) {
				end_date = format.parse(sdate);
			}
			day = (end_date.getTime() - begin_date.getTime()) / (24 * 60 * 60 * 1000);
		} catch (Exception e) {
			return -1;
		}
		return day;
	}

}
