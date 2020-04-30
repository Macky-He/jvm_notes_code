package com.jvm.memory;

/**
 * @Title class MyTest3
 * @Description: 使用jconsole和jvisualvm检测死锁
 * @Author Macky
 * @Date 2020/4/23 10:13
 */
public class MyTest3 {
    public static void main(String[] args) {
        new Thread(()-> A.method(),"Thread-A").start();
        new Thread(()-> B.method(),"Thread-B").start();
    }
}

class A{
    public static synchronized void method(){
        try {
            System.out.println("class A method");
            Thread.sleep(300);
            B.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class B{
    public static synchronized void method(){
        try {
            System.out.println("class B method");
            Thread.sleep(300);
            A.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
