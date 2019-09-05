package com.heima;

import java.sql.SQLOutput;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        //使用对象
//        System.out.println(s.name+ "," + s.age);
        s.name = "徐康";
        s.age = 18;
        System.out.println(s.name+ "," + s.age);
        s.study();
        s.doHomeWork();
    }
}
