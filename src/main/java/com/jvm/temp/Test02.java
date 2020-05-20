package com.jvm.temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Title class Test02
 * @Description: TODO
 * @Author Macky
 * @Date 2020/4/8 17:55
 */
public class Test02 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("11", "   ");
        List<String> filter = filter(strings, (String s) -> !s.isEmpty());
        System.out.println(filter);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for(T s: list){
            if(p.test(s)){
                results.add(s);
            }
        }
        return results;
    }
}
