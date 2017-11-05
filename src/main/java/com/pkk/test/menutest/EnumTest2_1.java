package com.pkk.test.menutest;

/**
 * Created by peikunkun on 2017/11/4 0004.
 * <枚举的使用，成员变量和方法>
 */
public enum EnumTest2_1 {
    MALE, FEMALE;//定义枚举【男,女】
    private String name;//定义成员变量

    public String getName() {
        return name;
    }

    public void setName(String name) {

        switch (this) {
            case MALE:
                if (name.equals("男")) {
                    this.name = name;
                } else {
                    System.out.println("参数不匹配");
                }
                break;
            case FEMALE:
                if (name.equals("女")) {
                    this.name = name;
                } else {
                    System.out.println("参数不匹配");
                }
                break;
            default:
                System.out.println("无匹配项");
                break;
        }
    }


}


class EnumTest2_2 {
    public static void main(String[] args) {
        EnumTest2_1 e = EnumTest2_1.valueOf(EnumTest2_1.class, "FEMALE");
        e.setName("男");
        System.out.println(e + "代表的是:" + e.getName());
        e.setName("女");
        System.out.println(e + "代表的是:" + e.getName());

    }
}