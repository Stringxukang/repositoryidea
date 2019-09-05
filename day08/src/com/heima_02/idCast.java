package com.heima_02;

import java.util.Scanner;

public class idCast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身份证号：");
        String id = sc.nextLine();
        if (id.startsWith("4201")==true){
            System.out.println("是武汉人");
        }else {
            System.out.println("不是武汉人");
        }
    }
}
