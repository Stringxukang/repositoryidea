package com.itheima;

import java.sql.SQLOutput;

public class MethodDemo_02 {
    public static void main(String[] args) {
        int result = Max(10,20);
        System.out.println(result);
        System.out.println(Max(10,20));
    }
    public static int Max(int a,int b){
        if (a > b){
            return a;
        }else{
            return b;
        }

    }
}
