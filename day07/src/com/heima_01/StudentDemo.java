package com.heima_01;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("徐康");
        s.setAge(-20);

        System.out.println(s.getName()+":"+s.getAge());
    }
}
