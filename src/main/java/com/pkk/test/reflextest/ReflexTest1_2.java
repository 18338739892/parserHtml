package com.pkk.test.reflextest;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

/**
 * Created by peikunkun on 2017/11/5 0005.
 */
public class ReflexTest1_2 {

    private static Logger logger = Logger.getLogger(ReflexTest1_2.class);

    public static void main(String[] args) {

        try {
            Class ReflexTest = Class.forName("com.pkk.test.reflextest.ReflexTest");

            logger.info("继承的类:"+ReflexTest.getSuperclass());
            logger.info("实现的类:"+ReflexTest.getInterfaces());
            logger.info("继承的类:"+ReflexTest.getSuperclass());
            logger.info("继承的类:"+ReflexTest.getSuperclass());



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            logger.info("未找到此类");
        }
        System.out.println();
    }

}
