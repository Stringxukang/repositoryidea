package com.test;

import java.util.Scanner;

public class Extend_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入大字符串：");
        String s1 = sc.nextLine();
        System.out.println("请输入小字符串：");
        String s2 = sc.nextLine();
        int count = 0;
        int j = 0;
        while ((j = s1.indexOf(s2)) != -1) {
            //获取str在字符串对象中第一次出现的索引
            count++;
            s1 = s1.substring(j + s2.length());//从指定的下标开始一直截取到最后(包含这个下标对应的文字)
        }
        System.out.println(count);
    }

}


