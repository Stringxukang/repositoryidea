package com.heima_03;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("徐康");
        s.setAge(18);
        s.show();
        Student s2 = new Student("林青霞", 18);// 使用带参对象直接创建带有属性值的对象
        s2.show();
    }
}
