package com.test;

public class Extend_02 {
    public static void main(String[] args) {
        String str = "abcrwabcgreabcrqrgqoabcrw";
        String s1 ="abc";
        stringNumber(str,s1);
    }
    public static void stringNumber(String s1,String s2){
        int j = 0;
        int count =0;
        while ((j = s1.indexOf(s2)) != -1) {
            //获取str在字符串对象中第一次出现的索引
            count++;
            s1 = s1.substring(j + s2.length());//从指定的下标开始一直截取到最后(包含这个下标对应的文字)
        }
        System.out.println(count);
    }
}
