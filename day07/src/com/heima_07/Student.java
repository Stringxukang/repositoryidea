package com.heima_07;

public class Student extends person{
    public Student(){}
    public Student(String name,int age){//使用有参构造方法的时候可以用super来调用父类中成员变量
        super(name, age);
    }
    public void study(){
        System.out.println("好好学习，天天向上");
    }
}
