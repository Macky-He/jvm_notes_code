package com.jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title class MyTest4
 * @Description:
 * jcmd
 *     -l:列出当前机器的JVM进程信息
 *     pid PerfCounter.print：查看指定进程的性能统计信息
 *     PID VM.uptime：查看JVM启动时长
 *     PID GC.class_histogram：查看类的统计信息
 *     PID Thread.print：查看线程堆栈信息
 *     PID GC.heap_dump FILE_NAME：查看JVM的Heap Dump
 *     PID VM.system_properties：查看JVM的属性信息
 *     PID VM.flags：查看JVM启动参数
 *     PID VM.command_line:查看JVM的启动命令行
 *     PID GC.run_finalization：对 JVM 执行 java.lang.System.runFinalization()
 *     PID GC.run：对 JVM 执行 java.lang.System.gc()
 *     PID PerfCounter.print：查看 JVM 性能相关的参数
 *     PID VM.version：查看目标jvm进程的版本信息
 * jhat
 * jstat
 * jstack
 * jmap：JVM Memory Map命令用于生成heap dump文件，如果不使用这个命令，还可以使用-XX:+HeapDumpOnOutOfMemoryError参数来让虚拟机出现OOM的时候自动生成dump文件。
 *    -heap PID:查看Java堆（heap）使用情况、
 *    -histo PID:查看堆内存(histogram)中的对象数量及大小
 *    -histo:live PID：VM会先触发gc，然后再统计信息。
 *    -dump:format=b,file=<fileName>:将堆Dump信息表保存到一个文件中
 * jps
 *    -q:只输出进程ID
 *    -m:显示传给main方法的参数
 *    -l:显示应用程序主类的完整软件包名称或应用程序JAR文件的完整路径名称。
 *    -v:显示传递给JVM的参数。
 *    -V:禁止类名称，JAR文件名和传递给main方法的参数的输出，仅生成本地JVM标识符的列表。
 * jinfo:输出JVM参数
 *    -flags：输出所有JVM参数
 *    -flag <name>:输出指定参数
 * @Author Macky
 * @Date 2020/4/27 10:00
 */
public class MyTest4 {

    public static void main(String[] args) throws Exception{
        List<MyTest4> list = new ArrayList<>();
        for (;;){
            Thread.sleep(30);
            System.out.println("Hello word!");
            list.add(new MyTest4());
        }
    }
}
