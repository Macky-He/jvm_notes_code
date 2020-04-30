package com.jvm.memory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @Title class MyTest1
 * @Description: TODO
 * @Author Macky
 * @Date 2020/4/23 9:35
 */
public class MyTest5 {

    public static void main(String[] args) {
        for (; ; ) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(MyTest5.class);
            enhancer.setCallback((MethodInterceptor) (obj, method, args1, proxy) -> proxy.invokeSuper(obj, args1));
            System.out.println("Hello word");
            Object o = enhancer.create();
        }

    }
}
