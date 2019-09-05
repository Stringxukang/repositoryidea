package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(100) + 1;//随机生成一个（1-100）的数
        System.out.println("请输入一个随机数字（1-100）：");
        //使用while循环到猜中数据
        while (true) {
            Scanner rc = new Scanner(System.in);
            int j = rc.nextInt();
            if (j > i) {
                System.out.println("你猜的数据" + j + "大了");
            } else if (j < i) {
                System.out.println("你猜的数据" + j + "小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;

            }
        }
    }

}
