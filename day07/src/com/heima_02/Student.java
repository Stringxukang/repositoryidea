package com.heima_02;

public class Student {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if (age>100||age<0){
            System.out.println("你输入的年龄有误");
        }else {
            this.age =age;
        }
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name +"," + age);
    }
}
