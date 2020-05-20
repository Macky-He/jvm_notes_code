package com.jvm.thread;

import java.util.concurrent.*;

/**
 * @Title class thread
 * @Description: TODO
 * @Author Macky
 * @Date 2020/4/15 14:59
 */
public class thread {

    /**
     * 创建一个线程池
     */
    private static ThreadPoolExecutor executor =
            new ThreadPoolExecutor(3, 3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        FutureTask futureTask = new FutureTask(() -> {
            Thread.currentThread().setName("Thread1");
            Thread.sleep(3000);
            return "我是子线程" + Thread.currentThread().getName();
        });
        executor.submit(futureTask);
        String o = (String) futureTask.get(200,TimeUnit.MILLISECONDS);
        System.out.println(o);
    }
}
