package com.jvm.gc;

/**
 * @Title class MyTest1
 * @Description:
 *
 * @Author Macky
 * @Date 2020/5/8
 */
public class MyTest2 {

    public static void main(String[] args) {
        //1M
        int size = 1024 * 1024;

        byte[] bytes0 = new byte[3 * size];
        byte[] bytes1 = new byte[3 * size];
        byte[] bytes2 = new byte[3 * size];
        byte[] bytes3 = new byte[3 * size];
        byte[] bytes4 = new byte[10 * size];
        System.out.println("hello word!");
    }
}
