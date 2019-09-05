package com.heima_04;
/*学生测试类
* */

public class StudentDmeo {
    public static void main(String[] args) {
        Student s = new Student();//创建学生对象
        s.setAge(18);
        s.setName("林青霞");
        System.out.println(s.getName()+","+s.getAge());
    }
}
