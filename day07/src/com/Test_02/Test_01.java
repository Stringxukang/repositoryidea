package com.Test_02;

import java.util.ArrayList;

public class Test_01 {
    public static void main(String[] args) {
        Student s1 = new Student(9001,55.0);
        Student s2 = new Student(9002,66.6);
        Student s3 = new Student(9003,77.0);
        ArrayList<Student> array = new ArrayList<>();
        array.add(s1);
        array.add(s2);
        array.add(s3);
        int sum = 0;
        for (int i = 0; i <array.size() ; i++) {
            if (array.get(i).getSid()==9002){
                array.remove(i);
            }
            sum+=array.get(i).getScore();
        }
        System.out.println("集合中剩余所有元素的成绩为:"+sum);

    }
}


