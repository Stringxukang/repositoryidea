package com.heima_03;

public class Student {
    //成员变量
    private String name;
    private int age;
//无参构造方法 public Student() {}
    public Student() {
    }
//有参构造方法
    public Student(String name, int age) {
        this.name =name;
        this.age =age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void show() {
        System.out.println(name + "," + age);
    }

}
