package com.jvm.queue;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Title class DiyQueue
 * @Description: TODO
 * @Author Macky
 * @Date 2020/4/15 10:53
 */
public class DiyQueue<T> implements Queue {

    /**
     * 队列头
     **/
    private volatile Node<T> head;

    /**
     * 队列尾
     */
    private volatile Node<T> tail;

    /**
     * 自定义队列元素
     */
    class DiyNode<T> extends Node<T>{
        public DiyNode(T item) {
            super(item);
        }
    }

    /**
     * 队列大小
     */
    private AtomicInteger size = new AtomicInteger(0);

    /**
     * 容量
     */
    private final static Integer CAPACITY = 10;

    @Override
    public boolean put(Object item) {
        return false;
    }

    @Override
    public Object take() {
        return null;
    }
}
