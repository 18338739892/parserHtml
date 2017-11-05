package com.pkk.test.reflextest;

/**
 * Created by peikunkun on 2017/11/5 0005.
 */
public class ReflexBase implements IReflexBase {

    @Override
    public void superShow() {
        System.out.println("父类的实现子类的重写");
    }

    private void superMethod() {
        System.out.println("父类的私有方法");
    }

}
