package com.heima_01;
//创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
/*
思路：
1:定义学生类
2:创建集合对象
3:创建学生对象
4:添加学生对象到集合中
5:遍历集合，采用通用遍历格式实现
*/
import java.util.ArrayList;

public class ArrayListTest02 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> arry = new ArrayList<>();
//创建学生对象
        Student s1 = new Student("大彬哥",21);
        Student s2 = new Student("王克群",20);
        Student s3 = new Student("孙文龙",19);
        Student s4 = new Student("徐  康",18);
        //添加学生对象到集合中
        arry.add(s1);
        arry.add(s2);
        arry.add(s3);
        arry.add(s4);
        //遍历集合
        for (int i = 0; i <arry.size() ; i++) {
            Student s =arry.get(i);
            System.out.println(s.getName()+ ","+ s.getAge());
        }
    }
}
