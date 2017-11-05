package com.pkk.test.reflextest;

/**
 * Created by peikunkun on 2017/11/5 0005.
 */
public class ReflexTest1_1 extends ReflexBase{

    private Integer id;
    private String name;
    private String password;


    private String privateMethod() {
        return "success";
    }

    public ReflexTest1_1() {
    }

    public ReflexTest1_1(Integer id) {
        this.id = id;
    }

    public ReflexTest1_1(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
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
        return "ReflexTest1_1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
