package com.haziy.entity;

import org.springframework.stereotype.Component;

import java.util.Objects;


public class UserEntity {
    private String name;
    private String age;

    public UserEntity() {
        System.out.println("使用user实体类的无参构造方法。");
    }

    public UserEntity(String name, String age) {
        this.name = name;
        this.age = age;
        System.out.println("调用了user实体类的有参构造方法");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return name.equals(that.name) && age.equals(that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
