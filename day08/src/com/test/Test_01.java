package com.test;

import java.util.Scanner;

public class Test_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个QQ号码：");
        String qq = sc.nextLine();
        if (qq.startsWith("0") != true) {
            if (qq.length() > +5 && qq.length() <= 12) {
                for (int i = 0; i < qq.length(); i++) {
                    if (qq.charAt(i) >= '0' && qq.charAt(i) <= '9') {
                        System.out.println("您输入的QQ号是正确的");
                        break;
                    }else {
                        System.out.println("您输入的QQ号有误");
                        break;
                    }
                }
            }else {
                System.out.println("您输入的QQ号有误");
            }
        }else {
            System.out.println("您输入的QQ号有误");
        }
    }
}