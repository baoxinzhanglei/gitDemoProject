package com.example.demo.util;

import org.springframework.util.ObjectUtils;

public class DemoObjectUtil extends ObjectUtils {


    /**
     * 判断对象是否为空，如果为空，直接抛出异常
     *
     * @param object       需要检查的对象
     * @param errorMessage 异常信息
     * @return 非空的对象
     */
    public static Object requireNonNull(Object object, String errorMessage) {
        if (null == object) {
            throw new NullPointerException(errorMessage);
        }
        return object;
    }

    public static boolean isNotEmpty(Object[] array) {
        return !ObjectUtils.isEmpty(array);
    }

    public static boolean isNotEmpty(Object obj) {
        return !ObjectUtils.isEmpty(obj);
    }
}
