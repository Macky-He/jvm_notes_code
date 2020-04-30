package com.jvm.temp;

import java.io.BufferedReader;

/**
 * @author Macky
 * @Title interface BufferedReaderProcessor
 * @Description: TODO
 * @date 2020/4/8 17:36
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader b) throws Exception;
}
