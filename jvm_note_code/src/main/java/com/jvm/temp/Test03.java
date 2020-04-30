package com.jvm.temp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @Title class Test03
 * @Description: TODO
 * @Author Macky
 * @Date 2020/4/10 14:10
 */
public class Test03 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        //        for (int i = 0; i < list.size(); i++) {
        //            if (list.get(i) == 3){
        //                list.remove(i);
        //            }
        //        }
        //只能删除掉一个3

        //        list.forEach((l)-> {if (l == 3) {
        //            list.remove(l);
        //        }});
        //        抛出异常
        //        Exception in thread "main" java.util.ConcurrentModificationException
        //        at java.util.ArrayList.forEach(ArrayList.java:1260)
        //        at com.jvm.temp.Test03.main(Test03.java:26)


//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer next = (Integer)iterator.next();
//            if (3==next) {
//                iterator.remove();
//            }
//            System.out.println(next);
//        }
        //能够正常删除
        System.out.println(list);
    }
}
