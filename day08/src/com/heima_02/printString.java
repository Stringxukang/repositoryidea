package com.heima_02;

import java.util.Scanner;

public class printString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s1 =sc.nextLine();
        for (int i = 0; i <s1.length() ; i++) {
            System.out.println(s1.charAt(i));
        }
    }
}
