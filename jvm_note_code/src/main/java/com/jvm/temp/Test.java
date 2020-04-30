package com.jvm.temp;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @Title class Test
 * @Description: TODO
 * @Author Macky
 * @Date 2020/4/8 17:37
 */
public class Test {

    public static void main(String[] args) throws Exception {
        System.out.println(processFile(BufferedReader::readLine));
        System.out.println(processFile((br) -> br.readLine() + br.readLine()));
    }

    public static String processFile(BufferedReaderProcessor p) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\data.txt"))) {
            return p.process(br);
        }
    }

    public synchronized static  void test(){

    }
}
