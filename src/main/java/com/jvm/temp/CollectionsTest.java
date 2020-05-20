package com.jvm.temp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Title class CollectionsTest
 * @Description: TODO
 * @Author Macky
 * @Date 2020/4/13 13:53
 */
public class CollectionsTest {

    public static void main(String[] args) {
        List<Object> objects = Collections.synchronizedList(new ArrayList<>(10));

        List<String> list = new CopyOnWriteArrayList();
    }
}
