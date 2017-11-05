package com.pkk.test.menutest;

/**
 * Created by peikunkun on 2017/11/4 0004.
 */
public enum EnumTest3_1 {

    MALE("男"), FEMAIL("女");

    private final String name;

    private EnumTest3_1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class EnumTest3_2 {
    public static void main(String[] args) {
        EnumTest3_1 e3 = EnumTest3_1.valueOf(EnumTest3_1.class, "MALE");

        System.out.println(e3 + "代表的是:" + e3.getName());
    }
}