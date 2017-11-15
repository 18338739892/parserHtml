package com.pkk.test.reflextest;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import com.pkk.model.SysMenu;

import static org.apache.struts2.interceptor.DateTextFieldInterceptor.DateWord.s;

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
//                System.out.println("4:" + publicMethod[i].getGenericPrameterTypes());
            }


            System.out.println("------------------------------------------------");


            Class reflexTest = ReflexTest.class;

            ReflexTest reflexTest4 = (ReflexTest) reflexTest.newInstance();

            System.out.println(reflexTest4);
            reflexTest4.setId(1);
            System.out.println(reflexTest4);

            Field id = reflexTest.getDeclaredField("id");
            Field name = reflexTest.getDeclaredField("name");

            id.set(reflexTest4, 2);
            name.setAccessible(true);//反射解决私有属性的屏障
            name.set(reflexTest4, "哈哈");

            System.out.println("name的属性为:" + name.get(reflexTest4));
            System.out.println(reflexTest4);

            System.out.println("--------------------------------------------------");


            System.out.println("---------------------根据方法属性参数类型获取方法-----------------------------");

            Class reflexTest5 = ReflexTest.class;

            ReflexTest reflexTest6 = (ReflexTest) reflexTest5.newInstance();

            Method[] methods = reflexTest5.getDeclaredMethods();//获取所有的方法

            Method idMethod = reflexTest5.getDeclaredMethod("getId");///获取单一方法

            Method idsMethod = reflexTest5.getDeclaredMethod("testMethod", Integer.class, String.class);

            System.out.println("根据属性参数来确认方法:" + idsMethod);

            System.out.println("------------------------使用invoke调用方法--------------------------");


            Class reflexTest7 = ReflexTest.class;

            ReflexTest reflexTest8 = (ReflexTest) reflexTest7.newInstance();

            Method idsMethod1 = reflexTest7.getDeclaredMethod("testMethod", Integer.class, String.class);

            String result = (String) idsMethod1.invoke(reflexTest8, 1, "杯盏余醇");

            System.out.println("方法返回值:" + result);

            System.out.println("---------------------构造方法-----------------------------");

            Class reflexTest9 = ReflexTest.class;


            Constructor constructor = reflexTest9.getConstructor();//无参构造方法

            System.out.println(constructor.getName() + "__" + Arrays.toString(constructor.getParameterTypes()));

            Constructor[] constructor1 = reflexTest9.getConstructors();//多个构造函数

            System.out.println("多个构造函数:");
            for (int i = 0; i < constructor1.length; i++) {
                System.out.println(constructor1[i].getName() + "__" + Arrays.toString(constructor1[i].getParameterTypes()));
            }

            System.out.println("获取指定构造函数");

            Constructor constructor2 = reflexTest9.getConstructor(Integer.class, String.class);

            System.out.println(constructor2.getName());

            ///创建对象，给构造函数传参
            ReflexTest reflexTest10 = (ReflexTest) constructor2.newInstance(new Object[]{1, "传参"});


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            logger.info("未找到此类");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------");
    }

}
