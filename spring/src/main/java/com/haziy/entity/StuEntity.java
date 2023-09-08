package com.haziy.entity;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StuEntity {
    private String[] arrays;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;

    public StuEntity() {
        System.out.println("StuEntity的无参构造方法");
    }

    public StuEntity(String[] arrays, List<String> list, Map<String, String> map, Set<String> set) {
        this.arrays = arrays;
        this.list = list;
        this.map = map;
        this.set = set;
        System.out.println("StuEntity的有参构造方法");
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "StuEntity{" +
                "arrays=" + Arrays.toString(arrays) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                '}';
    }
}
