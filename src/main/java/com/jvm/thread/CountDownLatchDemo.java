package com.jvm.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Title class CountDownLatchDemo
 * @Description: TODO
 * @Author Macky
 * @Date 2020/4/16 18:14
 */
public class CountDownLatchDemo {

    static class Work implements Runnable{
        private final CountDownLatch startSignal;
        private final CountDownLatch doneSignal;

        Work(CountDownLatch startSignal,CountDownLatch doneSignal){
            this.startSignal = startSignal;
            this.doneSignal = doneSignal;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + "begin");
                startSignal.await();
                dowork();


                doneSignal.countDown();
                System.out.println(Thread.currentThread().getName() + "end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        void dowork() throws InterruptedException{
            System.out.println(Thread.currentThread().getName() + "sleep 6S..............");
            Thread.sleep(6000);
        }
    }


    public static void main(String[] args) throws InterruptedException{
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch doneSignal = new CountDownLatch(9);

        for (int i = 0; i < 9; i++) {
            new Thread(new Work(startSignal,doneSignal)).start();
        }
        System.out.println("main thread begin");

        startSignal.countDown();

        doneSignal.await();

        System.out.println("main thread end ");
    }
}
