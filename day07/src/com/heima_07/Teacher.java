package com.heima_07;

public class Teacher extends person{
    public Teacher(){}
    public Teacher(String name, int age){
        super(name, age);
    }
    public void teacher(){
        System.out.println("老师应该好好教育学生");
    }
}
