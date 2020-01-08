package com.example.demo.util;

import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Map;

public class DemoCollectionUtils extends CollectionUtils {

    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }


    public static boolean isNotEmpty(Map<?, ?> map) {
        return !CollectionUtils.isEmpty(map);
    }
}
