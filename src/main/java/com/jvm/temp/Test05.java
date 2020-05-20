package com.jvm.temp;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Title class Test05
 * @Description: TODO
 * @Author Macky
 * @Date 2020/4/10 17:48
 */
public class Test05 {
    public static void main(String[] args) {
        Map<String, Object> ha = new HashMap<>(10);
        ha.put("a", "1");
        Object a = ha.putIfAbsent("a", "2");
        Object a1 = ha.putIfAbsent("a", "3");
        Object b = ha.getOrDefault("b", "5");
        System.out.println(a);
        System.out.println(a1);
        System.out.println(ha.size());
        System.out.println(b);
    }
}
