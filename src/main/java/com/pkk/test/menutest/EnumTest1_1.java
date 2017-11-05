package com.pkk.test.menutest;


/****************************************************
 *@author peikunkun<br/>
 *@date 2017/11/4 0004下午 1:01<br/>
 *@desc<枚举的使用><br/>
 ****************************************************/
public enum EnumTest1_1 {
    /********************<枚举知识描述>**************************
     * 1>:和普通类类似《和Interface,class地位相同》
     * 2>:定义menu自动继承了java.lang.Enum,不在继承Object,所以枚举不能显示继承其他父类，同时也默认实现了Serializable和Comoarable
     * 3>:非抽象的枚举类会默认使用final修饰，因此不能派生子类
     * 4>:枚举类构造器只能使用private修饰
     * 5>:枚举实例必须在第一行显示列出，系统默认使用public static final修饰，无需显示添加
     * 6>:枚举类默认提供values()方法，该方法可以很方便的遍历所有的枚举实例
     */

    //定义枚举实例
    Enum1, Enum2, Enum3, Enum4;

}


class EnumTest1_2 {

    public void show(EnumTest1_1 e1) {

        switch (e1) {
            case Enum1:
                System.out.println("Enum1");
                break;
            case Enum2:
                System.out.println("Enum2");
                break;
            case Enum3:
                System.out.println("Enum3");
                break;
            case Enum4:
                System.out.println("Enum4");
                break;
            default:
                System.out.println("无此枚举");
                break;
        }
    }


    public static void main(String[] args) {


        for (EnumTest1_1 enumTest1 : EnumTest1_1.values()) {
            System.out.println("枚举遍历:" + enumTest1);
        }

        new EnumTest1_2().show(EnumTest1_1.Enum3);

    }


}
