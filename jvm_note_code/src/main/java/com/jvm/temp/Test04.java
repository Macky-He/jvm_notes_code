package com.jvm.temp;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title class Test04
 * @Description: 测试hashMap
 * @Author Macky
 * @Date 2020/4/10 15:08
 */
public class Test04 {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(4);
        map.put("a","1");
        map.put("a","2");
        map.put("b","3");
        map.put("b","4");

        //创建一个期望大小的数组
        ArrayList<String> objects = Lists.newArrayListWithExpectedSize(10);
        objects.add("dsa ");
    }
}
