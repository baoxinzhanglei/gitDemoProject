package com.example.demo.util;

import org.springframework.util.StringUtils;

public class DemoStringUtils extends StringUtils {


    public static boolean isNotEmpty(String str) {
        return !StringUtils.isEmpty(str);
    }

    /**
     * 反转字符串
     * @param str
     * @return
     */
    public static String reverseStr(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();
        return reverse.toString();
    }

    /**
     * <pre>
     * StringUtil.substringBeforeFirst(null,"_") = null
     * StringUtil.substringBeforeFirst("","_")   = ""
     * StringUtil.substringBeforeFirst(abc,null) = abc
     * StringUtil.substringBeforeFirst(abc,"_")  = abc
     * StringUtil.substringBeforeFirst(ab_c,"_") = ab
     * StringUtil.substringBeforeFirst(_ab_c,"_") = ""
     * </pre>
     */
    public static String substringBeforeFirst(String str, String separator) {
        if ((str == null) || (separator == null) || (str.length() == 0)) {
            return str;
        }

        if (separator.length() == 0) {
            return "";
        }

        int pos = str.indexOf(separator);

        if (pos == -1) {
            return str;
        }

        return str.substring(0, pos);
    }

    /**
     * <pre>
     * StringUtil.substringAfterFirst(null,"_") = null
     * StringUtil.substringAfterFirst("","_")   = ""
     * StringUtil.substringAfterFirst(abc,null) = abc
     * StringUtil.substringAfterFirst(abc,"_")  = abc
     * StringUtil.substringAfterFirst(ab_c,"_") = c
     * StringUtil.substringAfterFirst(_ab_c,"_") = ab_c
     * StringUtil.substringAfterFirst(abc_,"_") = ""
     * </pre>
     */
    public static String substringAfterFirst(String str, String separator) {
        if ((str == null) || (separator == null) || (str.length() == 0)) {
            return str;
        }

        if (separator.length() == 0) {
            return "";
        }

        int pos = str.indexOf(separator);

        if (pos == -1) {
            return str;
        }

        return str.substring(pos + separator.length());
    }

    /**
     * 首字母小写 最高效
     * @param str
     * @return
     */
    public static String firstCharacterLowerCase(String str) {
        // 先将字符串转化为char类型的数组,然后通过字母的ascii码进行前移
        char[] cs= str.toCharArray();
        cs[0]+=32;
        return String.valueOf(cs);
    }

    /**
     * 首字母大写 最高效
     * @param str
     * @return
     */
    public static String firstCharacterUpperCase(String str) {
        // 先将字符串转化为char类型的数组,然后通过字母的ascii码进行前移
        char[] cs= str.toCharArray();
        cs[0]-=32;
        return String.valueOf(cs);
    }


}
