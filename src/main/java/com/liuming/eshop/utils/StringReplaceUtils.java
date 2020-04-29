package com.liuming.eshop.utils;

/**
 * @Description
 * @ClassName StringReplaceUtils
 * @Author 鲸落
 * @date 2020.04.26 10:58
 */
public class StringReplaceUtils {
    /**
     * @param str
     * @param len
     * @return java.lang.String
     * @Description 字符串向左截取
     * @author ShengLiu
     * @date 2018/7/4
     */
    public static String left(String str, int len) {
        if (str == null) {
            return null;
        }
        if (len < 0) {
            return "";
        }
        if (str.length() <= len) {
            return str;
        }
        return str.substring(0, len);

    }

    /**
     * @param str
     * @param len
     * @return java.lang.String
     * @Description 字符串向右截取
     * @author ShengLiu
     * @date 2018/7/4
     */
    public static String right(String str, int len) {
        if (str == null) {
            return null;
        }
        if (len < 0) {
            return "";
        }
        if (str.length() <= len) {
            return str;
        }
        return str.substring(str.length() - len);

    }

    public static String checkNameLength(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 1) {
            return str;
        } else if (str.length() == 2) {
            return StringReplaceUtils.left(str, 1) + "*";
        } else if (str.length() == 3) {
            return StringReplaceUtils.left(str, 1) + "*" + StringReplaceUtils.right(str, 1);
        } else if (str.length() == 4) {
            return StringReplaceUtils.left(str, 1) + "**" + StringReplaceUtils.right(str, 1);
        } else if (str.length() == 5) {
            return StringReplaceUtils.left(str, 2) + "***" + StringReplaceUtils.right(str, 1);
        } else if (str.length() == 6) {
            return StringReplaceUtils.left(str, 2) + "****" + StringReplaceUtils.right(str, 1);
        } else if (str.length() == 7) {
            return StringReplaceUtils.left(str, 2) + "*****" + StringReplaceUtils.right(str, 1);
        } else if (str.length() == 8) {
            return StringReplaceUtils.left(str, 2) + "******" + StringReplaceUtils.right(str, 1);
        } else if (str.length() >= 9) {
            return StringReplaceUtils.left(str, 2) + "*******" + StringReplaceUtils.right(str, 1);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(checkNameLength("张三三三四"));
    }
}
