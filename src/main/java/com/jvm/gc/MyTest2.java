package com.jvm.gc;

/**
 * @Title class MyTest1
 * @Description:
 *-verbose:gc
 * -Xmn10m
 * -Xms20m
 * -Xmx20m
 * -XX:+UseConcMarkSweepGC
 * -XX:+PrintGCDetails
 *[GC (Allocation Failure) [ParNew: 8024K->658K(9216K), 0.0027282 secs] 8024K->6804K(19456K), 0.0027774 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [GC (Allocation Failure) [ParNew: 7044K->7044K(9216K), 0.0000106 secs][CMS: 6146K->9216K(10240K), 0.0047894 secs] 13190K->12909K(19456K), [Metaspace: 3196K->3196K(1056768K)], 0.0048411 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
 * [Full GC (Allocation Failure) [CMS: 9216K->9216K(10240K), 0.0021121 secs] 12909K->12891K(19456K), [Metaspace: 3196K->3196K(1056768K)], 0.0021394 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [GC (CMS Initial Mark) [1 CMS-initial-mark: 9216K(10240K)] 12946K(19456K), 0.0003286 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [CMS-concurrent-mark-start]
 * [CMS-concurrent-mark: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [CMS-concurrent-preclean-start]
 * [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [CMS-concurrent-abortable-preclean-start]
 * [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [GC (CMS Final Remark) [YG occupancy: 4025 K (9216 K)][Rescan (parallel) , 0.0002931 secs][weak refs processing, 0.0000046 secs][class unloading, 0.0001879 secs][scrub symbol table, 0.0006424 secs][scrub string table, 0.0001159 secs][1 CMS-remark: 9216K(10240K)] 13242K(19456K), 0.0012973 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [CMS-concurrent-sweep-start]
 * [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [CMS-concurrent-reset-start]
 * [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * Heap
 *  par new generation   total 9216K, used 4272K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 *   eden space 8192K,  52% used [0x00000000fec00000, 0x00000000ff02c058, 0x00000000ff400000)
 *   from space 1024K,   0% used [0x00000000ff500000, 0x00000000ff500000, 0x00000000ff600000)
 *   to   space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400000, 0x00000000ff500000)
 *  concurrent mark-sweep generation total 10240K, used 9216K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 *  Metaspace       used 3252K, capacity 4496K, committed 4864K, reserved 1056768K
 *   class space    used 353K, capacity 388K, committed 512K, reserved 1048576K
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 * 	at com.jvm.gc.MyTest2.main(MyTest2.java:20)
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
