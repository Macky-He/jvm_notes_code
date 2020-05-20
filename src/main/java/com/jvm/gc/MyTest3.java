package com.jvm.gc;

/**
 * @Title class MyTest3
 * @Description:
 *
 * @Author Macky
 * @Date 2020/5/8
 */
public class MyTest3 {

    public static void main(String[] args) {
        //1M
        int size = 1024 * 1024;

        byte[] bytes0 = new byte[2 * size];
        byte[] bytes1 = new byte[2 * size];
        byte[] bytes2 = new byte[2 * size];
        byte[] bytes3 = new byte[2 * size];
        System.out.println("hello word!");
    }
}
