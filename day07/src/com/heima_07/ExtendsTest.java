package com.heima_07;

public class ExtendsTest {
    public static void main(String[] args) {
    //学生测试类
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(30);
        System.out.println(s1.getName()+"----"+s1.getAge());
        s1.study();

        //老师测试类
        Teacher t1 = new Teacher();
        t1.setName("张三丰");
        t1.setAge(66);
        System.out.println(t1.getName()+"-----"+t1.getAge());
        t1.teacher();
        Teacher t2 =new Teacher("张无忌",28);
        System.out.println(t2.getName()+"-----"+t2.getAge());
        t2.teacher();
    }
}
