package com.heima;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array =new ArrayList<String>();
        array.add("hello");
        array.add("java");
        array.add("11");
        System.out.println(array);
        array.remove("11");
        System.out.println(array);
        array.remove(0);
        System.out.println(array);
        array.add("hhhhhh");
        System.out.println(array);
        array.set(1,"hehehehe");
        array.add(1,"wangkequn");
        array.add(2,"大帅比的吊");
        System.out.println(array);
        System.out.println(array.get(1));
        System.out.println(array.size());


    }
}
