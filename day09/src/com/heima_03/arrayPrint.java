package com.heima_03;

import java.util.ArrayList;

public class arrayPrint {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("raobin");
        array.add("xukang");
        array.add("diaoqun");
        for (int i = 0; i <array.size() ; i++) {
            System.out.println(array.get(i));
        }

        ArrayList<Student>  array1 = new ArrayList<>();
        Student s1 =new Student("xukang",18);
        Student s2 =new Student("dabige",28);
        Student s3 =new Student("xiaobige",18);
        array1.add(s1);
        array1.add(s2);
        array1.add(s3);
        for (int i = 0; i <array1.size() ; i++) {
            Student s=array1.get(i);
            System.out.println(s.getName()+"\t"+s.getAge());
        }
    }
}
