package com.jvm.classloader;

import com.sun.crypto.provider.AESKeyGenerator;

public class MyTest19 {
    public static void main(String[] args) {
        // AESKeyGenerator 类位于扩展类加载器所加载类的路径中
        AESKeyGenerator aesKeyGenerator = new AESKeyGenerator();

        System.out.println(aesKeyGenerator.getClass().getClassLoader());
        System.out.println(MyTest19.class.getClassLoader());
        // 运行结果
        /*
sun.misc.Launcher$ExtClassLoader@266474c2
sun.misc.Launcher$AppClassLoader@135fbaa4
         */

        // Terminal 下运行结果。
        // 将扩展类加载器所加载类的路径改为当前路径，但当前路径下不存在 AESKeyGenerator 的类文件，所以报错
        /*
G:\my_github_repo\jvm_notes_code\target\classes>java -Djava.ext.dirs=./ com.jvm.classloader.MyTest19
Exception in thread "main" java.lang.NoClassDefFoundError: com/sun/crypto/provider/AESKeyGenerator
        at com.jvm.classloader.MyTest19.main(MyTest19.java:8)
Caused by: java.lang.ClassNotFoundException: com.sun.crypto.provider.AESKeyGenerator
        at java.net.URLClassLoader.findClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        ... 1 more
         */
    }
}
