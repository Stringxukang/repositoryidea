package com.test;

import java.util.Random;

public class Extend_03 {
    public static void main(String[] args) {
        System.out.println(getStr());

    }
    public static String getStr(){
        //.定义String getStr()方法
        //		功能描述：这个方法会返回长度为5的随机字符串，要求这个字符串，包含4个大写字母和1个数字。
        char[] ch = new char[26];
        int index = 0;
        for (int i = 'A'; i <'Z' ; i++) {
            ch[index]= (char) i;
            index++;
        }
        Random r = new Random();
        StringBuilder s1 =new StringBuilder();
        for (int i = 0; i <4 ; i++) {
            int num =r.nextInt(26);
            s1.append(ch[num]);
        }
        s1.insert(r.nextInt(5),r.nextInt(10));
        return s1.toString();
    }

}
