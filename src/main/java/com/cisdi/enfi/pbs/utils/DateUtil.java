package com.cisdi.enfi.pbs.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * 常用处理时间的方法类
 * </p>
 * 
 * @author Leckie
 * @date 2014年9月2日
 */
public class DateUtil {

	public static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";

	public static final String UTC_PATTERN = "yyyy-MM-dd'T'HH:mm:ss+HH:mm";// 可能在不同时区服务器上会出现问题

	public static final String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	public static final String DATE_PATTERN = "yyyy-MM-dd";

	public static final String TIME_PATTERN = "HH:mm:ss";

	/**
	 * 将UTC格式的时间字符串转换为<code>java.util.Date</code>对象<br>
	 * 
	 * @param utc
	 * UTC格式的时间字符串
	 * @return Date对象或者null
	 * @throws ParseException
	 * 如果参数和pattern不匹配
	 */
	public static Date UTC2Date(String utc) throws ParseException {
		if (utc == null) {
			return null;
		}
		DateFormat sdf = new SimpleDateFormat(UTC_PATTERN);
		Date date = sdf.parse(utc);
		return date;
	}

	/**
	 * 模糊转换，只关注到日期<br>
	 * 将日期字符串转换为<code>java.util.Date</code>对象<br>
	 * 
	 * @param dateStr
	 * 如果参数长度超过DATE_PATTERN的长度将截取DATE_PATTERN长度的字符串来转换
	 * @return Date对象或者null
	 * @throws ParseException
	 * 如果参数和pattern不匹配
	 */
	public static Date dateStr2Date(String dateStr) throws ParseException {
		if (dateStr == null||"".equals(dateStr.trim())) {
			return null;
		}
		DateFormat sdf = new SimpleDateFormat(DATE_PATTERN);
		Date date = sdf.parse(dateStr.substring(0, DATE_PATTERN.length()));
		return date;
	}

	/**
	 * 将日期字符串转换为<code>java.util.Date</code>对象<br>
	 * 
	 * @param str
	 * @return
	 * @throws ParseException
	 * @see <code>dateStr2Date(String dateStr)</code>
	 */
	public static Date str2Date(String str) throws ParseException {
		if (str == null) {
			return null;
		}
		DateFormat sdf = new SimpleDateFormat(DEFAULT_PATTERN);
		Date date = null;
		try {
			date = sdf.parse(str);// 先严格转换
		} catch ( ParseException e1 ) {
			try {
				date = UTC2Date(str);// 再当成UTC时间字符串处理严格转换
			} catch ( ParseException e2 ) {
				date = dateStr2Date(str);// 最后，发生异常，降低要求
			}
		}
		return date;
	}

	/**
	 * 讲一个Object对象转换为Date对象<br>
	 * 如果obj直接是Date类型，不用转换，直接返回，否则当成字符串处理<br>
	 * 
	 * @param obj
	 * @return null 或者Date对象
	 */
	public static Date obj2Date(Object obj) {
		if (obj == null) {
			return null;
		}
		// 如果obj直接是Date类型，不用转换，否则当成字符串处理
		if (obj instanceof Date) {
			return (Date) obj;
		}
		try {
			return str2Date(String.valueOf(obj));
		} catch ( ParseException e ) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 将Date对象转换为默认格式的字符串<br>
	 * DEFAULT_PATTERN : yyyy-MM-dd HH:mm:ss<br>
	 * 
	 * @param date
	 * @return
	 */
	public static String date2Str(Date date) {
		if (date == null) {
			return null;
		}
		DateFormat sdf = new SimpleDateFormat(DEFAULT_PATTERN);
		String str = sdf.format(date);
		return str;
	}

	/**
	 * 返回指定pattern格式的时间字符串<br>
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String date2Str(Date date, String pattern) {
		if (date == null) {
			return null;
		}
		DateFormat sdf = new SimpleDateFormat(pattern);
		String str = sdf.format(date);
		return str;
	}
}
