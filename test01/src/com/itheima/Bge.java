package com.itheima;
import java.util.Scanner;
public class Bge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入B哥带了多少钱");
        int money = sc.nextInt();
        if (money >= 500){
            System.out.println("B哥请吃大餐");
        }
        else if (money >= 400 ){
            System.out.println("B哥请吃中餐");
        }
        else if ( money >= 300){
            System.out.println("B哥请吃小餐");
        }
        else if ( money >=200){
            System.out.println("B哥请吃喝水");
        }
        else {
            System.out.println("B哥你去吃屎吧");
        }
    }
}
