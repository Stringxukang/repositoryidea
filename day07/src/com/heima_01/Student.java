package com.heima_01;

public class Student {
    private String name;
    private int age;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        if (a>100||a<0){
            System.out.println("你输入的年龄有误");
        }else {
            age =a;
        }
    }
    public int getAge(){
        return age;
    }
}
