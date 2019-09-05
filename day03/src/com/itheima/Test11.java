package com.itheima;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            //  for (int i = 1; i<=3;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请猜猜我的年龄：");
            int age = sc.nextInt();

            if (age == 18) {
                System.out.println("陌陌号：12345678");
                break;
            } else if (age > 18) {
                System.out.println("你会不会说话啊，我有那么老吗？");
            } else {
                System.out.println("我太高兴了，你真会聊天");
            }
            i++;
        }
    }

}


