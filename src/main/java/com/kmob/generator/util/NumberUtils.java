package com.kmob.generator.util;

import java.math.BigDecimal;

/**
 * 数字处理
 * 
 * @author verne
 */
public class NumberUtils {

    private NumberUtils() {}

    /**
     * 如果是null返回0
     * 
     * @param obj
     * @return
     */
    public static int parseInt(Object obj) {
        int value = 0;
        if (obj != null) {
            try {
                value = Integer.parseInt(obj.toString());
            } catch (Exception e) {
                value = 0;
            }
        }
        return value;
    }

    /**
     * 如果是null返回BigDecimal.ZERO
     * 
     * @param obj
     * @return
     */
    public static BigDecimal parseBigDecimal(Object obj) {
        BigDecimal value = BigDecimal.ZERO;
        if (obj != null) {
            try {
                value = new BigDecimal(obj.toString());
            } catch (Exception e) {
                value = BigDecimal.ZERO;
            }
        }
        return value;
    }



    /**
     * 将传入的字符串转成int型数据 . 遇到任何错误返回0
     * 
     * @param str 待解析的字符串
     * @return 解析结果
     */
    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    /**
     * 将传入的字符串转成int型数据 . 遇到任何错误返回replaceWith
     * 
     * @param str 待解析的字符串
     * @param defaultValue 遇到错误时的替换数字 .
     * @return 解析结果
     */
    public static int parseInt(String str, int defaultValue) {
        try {
            defaultValue = Integer.parseInt(str);
        } catch (Exception e) {}
        return defaultValue;
    }

    /**
     * 将传入的字符串转成double型数据 . 遇到任何错误返回0
     * 
     * @param str 待解析的字符串
     * @return 解析结果
     */
    public static double parseDbl(String str) {
        return parseDbl(str, 0);
    }

    /**
     * 将传入的字符串转成double型数据 . 遇到任何错误返回replaceWith
     * 
     * @param str 待解析的字符串
     * @param defaultValue 遇到错误时的替换数字 .
     * @return 解析结果
     */
    public static double parseDbl(String str, double defaultValue) {
        try {
            defaultValue = Double.parseDouble(str);
        } catch (Exception e) {}
        return defaultValue;
    }

    public static float parseFloat(String str) {
        return parseFloat(str, 0);
    }

    public static float parseFloat(String str, float b) {
        try {
            return Float.parseFloat(str);
        } catch (Exception e) {
            return b;
        }
    }

    /**
     * 遇到错误返回0L
     * 
     * @author 王平
     * @since 2009.04.30
     * @param str
     * @return
     */
    public static long parseLong(String str) {
        return parseLong(str, 0L);
    }

    /**
     * 遇到错误返回defaultValue
     * 
     * @author 王平
     * @since 2009.04.30
     * @param str
     * @return
     */
    public static long parseLong(String str, long defaultValue) {
        try {
            defaultValue = Long.parseLong(str);
        } catch (Exception e) {}
        return defaultValue;
    }

}
