package com.itheima;
import java.util.Scanner;
public class Eatfan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入B哥钱包钱的数量：");
        double i = sc.nextDouble();
        if (i > 100){
            System.out.println("请大家吃饭");
        }
        else{
            System.out.println("B哥，你好穷呀");
        }

    }


}
