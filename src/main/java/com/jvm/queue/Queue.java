package com.jvm.queue;

/**
 * @Title class Queue
 * @Description: 自定义队列
 * @Author Macky
 * @Date 2020/4/14 17:59
 */
public interface Queue<T> {

    /**
     * 放数据
     *
     * @param item 入参
     * @return boolean true为成功，false为失败
     **/
    boolean put(T item);

    /**
     * 取数据
     *
     * @param
     * @return T
     **/
    T take();

    /**
     * 节点类
     **/
    class Node<T> {
        //数据本身
        T item;

        //下一个元素
        Node<T> next;

        public Node(T item) {
            this.item = item;
        }
    }
}
