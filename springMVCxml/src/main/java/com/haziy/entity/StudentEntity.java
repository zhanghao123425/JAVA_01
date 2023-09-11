package com.haziy.entity;

public class StudentEntity {
    private String name;
    private Integer age;

    private ClassesEntity classesEntity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ClassesEntity getClassesEntity() {
        return classesEntity;
    }

    public void setClassesEntity(ClassesEntity classesEntity) {
        this.classesEntity = classesEntity;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classesEntity=" + classesEntity +
                '}';
    }
}
