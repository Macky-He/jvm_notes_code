package com.jvm.gc;

/**
 * @Title class MyTest1
 * @Description:
 * [GC (Allocation Failure) [PSYoungGen: 8191K->744K(9216K)] 8191K->6896K(19456K), 0.0028412 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * 解释：内存分配失败，为minor GC ;PSYoungGen(parallel scavenge) 默认年轻代垃圾收集器，
 * [Full GC (Ergonomics) [PSYoungGen: 744K->0K(9216K)] [ParOldGen: 6152K->6810K(10240K)] 6896K->6810K(19456K), [Metaspace: 3220K->3220K(1056768K)], 0.0046608 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
 * [Full GC (Ergonomics) [PSYoungGen: 6301K->3072K(9216K)] [ParOldGen: 6810K->9862K(10240K)] 13111K->12934K(19456K), [Metaspace: 3220K->3220K(1056768K)], 0.0045575 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * [Full GC (Allocation Failure) [PSYoungGen: 3072K->3072K(9216K)] [ParOldGen: 9862K->9844K(10240K)] 12934K->12916K(19456K), [Metaspace: 3220K->3220K(1056768K)], 0.0047961 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
 * Heap
 *  PSYoungGen      total 9216K, used 3448K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 *   eden space 8192K, 42% used [0x00000000ff600000,0x00000000ff95e160,0x00000000ffe00000)
 *   from space 1024K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x00000000fff00000)
 *   to   space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
 *  ParOldGen       total 10240K, used 9844K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 *   object space 10240K, 96% used [0x00000000fec00000,0x00000000ff59d158,0x00000000ff600000)
 *  Metaspace       used 3253K, capacity 4496K, committed 4864K, reserved 1056768K
 *   class space    used 353K, capacity 388K, committed 512K, reserved 1048576K
 *
 * @Author Macky
 * @Date 2020/5/8
 */
public class MyTest1 {

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
