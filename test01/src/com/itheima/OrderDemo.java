package com.itheima;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class OrderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i = sc.nextInt();
        if (i % 2 ==0){
            System.out.println(i + "是偶数");
        }
        else {
            System.out.println(i + "是奇数");


        }

    }
}
