package com.itheima;

public class Three {

    public static void main(String[] args){
        int high1 = 150;
        int high2 = 210;
        int high3 = 165;
        int i = high1>high2?high1:high2;
        int max = i>high3?i:high3;
        System.out.println(max);
    }
}
