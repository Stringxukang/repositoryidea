package com.heima_04;
/*
* 学生类*/

public class Student {
    private String name;
    private int age;
    public Student(){} //无参构造方法
    public Student(String name,int age){
        this.name = name ;
        this.age = age;

    }

    public void setName(String name){
         this.name=name;
     }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}
