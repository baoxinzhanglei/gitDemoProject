package com.example.demo.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.List;
import java.util.Map;

public class DemoJSONUtil {



    /**
     * 默认json格式化方式
     */
    public static final SerializerFeature[] DEFAULT_FORMAT = {
            SerializerFeature.WriteDateUseDateFormat,
            SerializerFeature.WriteEnumUsingToString,
            SerializerFeature.WriteMapNullValue,
            SerializerFeature.WriteNullNumberAsZero,
            SerializerFeature.WriteNullListAsEmpty,
            SerializerFeature.WriteNullBooleanAsFalse,
            SerializerFeature.WriteNullStringAsEmpty,
            SerializerFeature.WriteNonStringKeyAsString,
            SerializerFeature.QuoteFieldNames,
            SerializerFeature.SkipTransientField,
            SerializerFeature.DisableCircularReferenceDetect,
            SerializerFeature.SortField
            /*, SerializerFeature.PrettyFormat*/};

    private DemoJSONUtil() {
    }

    /**
     * 从json获取指定key的字符串
     *
     * @param json json字符串
     * @param key  字符串的key
     * @return 指定key的值
     */
    public static Object getStrFromJSONStr(final String json, final String key) {
        return JSON.parseObject(json).getString(key);
    }

    /**
     * 将字符串转换成JSON对象
     *
     * @param jsonString json字符串
     * @return 转换成的json对象
     */
    public static JSONObject toJSONObject(final String jsonString) {
        if (DemoObjectUtil.isEmpty(jsonString)) {
            return new JSONObject();
        }
        return JSON.parseObject(jsonString);
    }

    /**
     * 将json字符串，转换成指定java bean
     *
     * @param jsonStr   json串对象
     * @param beanClass 指定的bean
     * @param <T>       任意bean的类型
     * @return 转换后的java bean对象
     */
    public static <T> T toBean(String jsonStr, Class<T> beanClass) {
        JSONObject jo = JSON.parseObject(jsonStr);
        jo.put(JSON.DEFAULT_TYPE_KEY, beanClass.getName());
        return JSON.parseObject(jo.toJSONString(), beanClass);
    }

    /**
     * 将json字符串，转换成指定java bean
     *
     * @param jsonStr   json串对象
     * @param beanClass 指定的bean
     * @param <T>       任意bean的类型
     * @return 转换后的java bean对象
     */
    public static <T> List<T> toListBean(String jsonStr, Class<T> beanClass) {
        return JSONArray.parseArray(jsonStr, beanClass);
    }

    /**
     * @param obj 需要转换的java bean
     * @param <T> 入参对象类型泛型
     * @return 对应的json字符串
     */
    public static <T> String toJson(T obj) {
        return JSON.toJSONString(obj, DEFAULT_FORMAT);
    }

    /**
     * 通过Map生成一个json字符串
     *
     * @param map 需要转换的map
     * @return json串
     */
    public static String toJson(Map<String, Object> map) {
        return JSON.toJSONString(map, DEFAULT_FORMAT);
    }

    /**
     * 美化传入的json,使得该json字符串容易查看
     *
     * @param jsonString 需要处理的json串
     * @return 美化后的json串
     */
    public static String prettyFormatJson(String jsonString) {
        return JSON.toJSONString(toJSONObject(jsonString), true);
    }

    /**
     * 将传入的json字符串转换成Map
     *
     * @param jsonString 需要处理的json串
     * @return 对应的map
     */
    public static Map<String, Object> toMap(String jsonString) {
        return toJSONObject(jsonString);
    }

    /**
     * 通过Object生成一个jsonObject
     *
     * @param o 需要转换的map
     * @return JSONObject
     */
    public static JSONObject toJsonObject(Object o) {
        if(o instanceof String){
            return JSONObject.parseObject(o.toString());
        }else{
            return JSONObject.parseObject(DemoJSONUtil.toJson(o));
        }
    }

    /**
     * 通过Object生成一个jsonArray
     *
     * @param o 需要转换的map
     * @return JSONArray
     */
    public static JSONArray toJsonArray(Object o) {
        if(o instanceof String){
            return JSONArray.parseArray(o.toString());
        }
        return JSONArray.parseArray(DemoJSONUtil.toJson(o));
    }


}
