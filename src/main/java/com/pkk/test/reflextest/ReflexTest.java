package com.pkk.test.reflextest;

/**
 * Created by peikunkun on 2017/11/5 0005.
 */
public class ReflexTest extends ReflexBase {

    public  Integer id;
    private String  name;
    private String  password;


    private String privateMethod() {
        return "success";
    }

    public ReflexTest() {
    }


    public ReflexTest(Integer id) {

        System.out.println("构造方法1");
        this.id = id;
    }

    public ReflexTest(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        System.out.println(id + "-" + "-" + name + "-" + password);
        System.out.println("构造方法3");
    }

    public ReflexTest(Integer id, String name) {
        this.id = id;
        this.name = name;
        System.out.println(id + "-" + "-" + name);
        System.out.println("构造方法2");
    }


    public String testMethod(Integer id, String name) {
        System.out.println("自定义方法调用成功");
        return "SUCCESS";
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ReflexTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
