package com.haziy.entity;

public class MemberEntity {
    private String name;

    public MemberEntity() {
        System.out.println("[第一步]-无参构造函数被执行---反射机制调用");
    }

    public void setName(String name) {
        System.out.println("[第二步]-set方法初始化属性---反射机制调用");
        this.name = name;
    }
    public void init(){
        System.out.println("[第三步]-回调调用init初始化方法");
    }

    public void destory(){
        System.out.println("[第五步]-回调调用destroyMethod方法");
    }

    @Override
    public String toString() {
        return "MemberEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
