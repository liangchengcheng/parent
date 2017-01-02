package com.lcc.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lcc on 2017/1/2.
 */
public class TimeUtils {

    //1分钟
    private final static long minute = 60 * 1000;

    //1小时
    private final static long hour = 60 * minute;

    //1天
    private final static long day = 24 * hour;

    //月
    private final static long month = 31 * day;

    //念
    private final static long year = 12 * month;

    public static final SimpleDateFormat DATE_FORMAT_DATE_D = new SimpleDateFormat("yyyy-MM-dd");
    public static final SimpleDateFormat DATE_FORMAT_DATE_M = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    public static final SimpleDateFormat DATE_FORMAT_DATE_S = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private TimeUtils() {
        throw new AssertionError();
    }

    /**
     * long time to string
     */
    public static String getTime(long timeInMillis, SimpleDateFormat dateFormat){
        return dateFormat.format(new Date(timeInMillis));
    }

    /**
     * long time to string, format is {@link #DEFAULT_DATE_FORMAT}
     */
    public static String getTime(long timeInMillis) {
        return getTime(timeInMillis, DATE_FORMAT_DATE_S);
    }

    /**
     * get current time in milliseconds
     */
    public static long getCurrentTimeInLong() {
        return System.currentTimeMillis();
    }

    /**
     * get current time in milliseconds, format is {@link #DEFAULT_DATE_FORMAT}
     */
    public static String getCurrentTimeInString() {
        return getTime(getCurrentTimeInLong());
    }

    public static String getTimeFormatText(Date date){
        if (date == null) {
            return null;
        }
        long diff = new Date().getTime() - date.getTime();
        long r = 0;
        if (diff > year) {
            r = (diff / year);
            return r + "年前";
        }
        if (diff > month) {
            r = (diff / month);
            return r + "个月前";
        }
        if (diff > day) {
            r = (diff / day);
            return r + "天前";
        }
        if (diff > hour) {
            r = (diff / hour);
            return r + "小时前";
        }
        if (diff > minute) {
            r = (diff / minute);
            return r + "分钟前";
        }
        return "刚刚";
    }

}
