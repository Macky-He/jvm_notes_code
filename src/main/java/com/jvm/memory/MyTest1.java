package com.jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title class MyTest2
 * @Description:
 * 虚拟机栈：Stack Frame 栈帧（线程私有）
 * 程序计数器（program Counter）：记录程序运行的行号等信息（线程私有）
 * 本地方法栈：用于执行本地方法（线程私有）
 * 堆（Heap）：JVM管理的最大的一块内存空间（线程共享），垃圾收集器，堆空间区域划分：老年代和新生代，Eden空间，from survivor空间和to Survivor空间。
 * 可以连续存放也可以不连续存放
 * 方法区（Method Area）：存储元信息。永久代（Permanent Genaration）。从JDK1.8起，已经废弃了永久带，使用元空间（Meta Space）
 * 运行时常量池：方法区的一部分
 * 直接内存：系统内存，和Java NIO有关，JVM通过DirectByteBuffer来操作直接内存
 *
 * 关于Java对象创建的过程：
 *
 * new关键字的三个步骤：
 *
 * 1.在堆内存中创建出对象的实例
 * 2.为对象的实例成员变量赋初值
 * 3.将对象的引用返回
 *
 * 对象存储的方式
 * 指针碰撞（前提时堆中的空间通过一个指针进行分割，一侧时已北占用的空间，另一侧为未被占用的空间）
 * 空闲列表（前提时堆内存空间中已被使用和未被使用的空间时交织在一起的，这时，虚拟机就许哟啊通过一个列表来记录哪些空间是可以使用的。
 * 哪些空间是已被使用的，接下来找出可以容纳下新创建对象的且未被使用的空间，在此空间存放该对象，同时还要修改列表上的记录）
 *
 * 对象在内存中的布局：
 * 1.对象头
 * 2.实例数据（我i们在类中声明的信息）
 * 3.对齐填充
 *
 * 引用访问对象的方式：
 * 1.使用句柄的方式
 * 2.使用直接指针的方式
 *
 * @Author Macky
 * @Date 2020/4/23 22:58
 */
public class MyTest1 {

    public static void main(String[] args) {
        List<MyTest1> list = new ArrayList<>();

        for (;;){
            list.add(new MyTest1());
        }
    }
}
