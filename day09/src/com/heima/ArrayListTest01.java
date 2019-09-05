package com.heima;

import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("大逼哥");
        array.add("王克群");
        array.add("孙文龙");
        for (int i = 0; i <array.size() ; i++) {
            String s = array.get(i);
            System.out.println(s);
        }
    }
}
