package com.itheima;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class Day02Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入你的年龄：");
         int age = sc.nextInt();
        System.out.println("请输入你的身高：");
         int height = sc.nextInt();
         System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("身高：" + height);

    }
}
