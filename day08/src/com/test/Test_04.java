package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        char[] ch = new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            ch[i]=s.charAt(i);
        }
        for (int i = 0; i <ch.length ; i++) {
            if (ch[0]>='a'&&ch[0]<='z'){
                ch[0]-=32;
            }
        }

        String s1= Arrays.toString(ch);
        System.out.println(s1);
    }
}
