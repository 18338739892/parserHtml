package com.pkk.test.reflextest;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import com.pkk.model.SysMenu;

/**
 * Created by peikunkun on 2017/11/5 0005.
 */
public class ReflexTest1_2 {

    private static Logger logger = Logger.getLogger(ReflexTest1_2.class);

    public static void main(String[] args) {

        try {
            /**
             *获取类的方式1
             */
            Class reflexTest1 = Class.forName("com.pkk.test.reflextest.ReflexTest");

            /**
             *获取类的方式2
             */
            Class reflexTest2 = ReflexTest.class;

            /**
             *获取类的方式3
             */
            Class reflexTest3 = ReflexTest.class.getClass();

            logger.info("继承的类:" + reflexTest1.getSuperclass());
            logger.info("实现的类:" + reflexTest1.getInterfaces());
            logger.info("类全路径:" + reflexTest1.getName());
            logger.info("类简要名:" + reflexTest1.getSimpleName());

            /***********************<1:获取方法>*****************************/

            /**
             *获取包括父类的所有----公共-----方法
             */

            Method[] publicMethod = reflexTest1.getMethods();

            for (int i = 0; i < publicMethod.length; i++) {
                System.out.println("方法的名称:" + publicMethod[i].getName());


                Parameter[] publicMethodParam = publicMethod[i].getParameters();

                for (int j = 0; j < publicMethodParam.length; j++) {
                    System.out.println("方法名称为:" + publicMethod[i].getName() + "的参数为:" + publicMethodParam[j].getName());
                }

                System.out.println("1:" + publicMethod[i].getAnnotatedReturnType());

                System.out.println("2:" + publicMethod[i].getDeclaredAnnotations());
                System.out.println("3:" + publicMethod[i].getDefaultValue());
                System.out.println("4:" + publicMethod[i].getGenericParameterTypes());
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            logger.info("未找到此类");
        }
        System.out.println();
    }

}
