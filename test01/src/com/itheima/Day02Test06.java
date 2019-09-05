package com.itheima;
import java.util.Scanner;
public class Day02Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("银行存款有多少万：");
        int money = sc.nextInt();
        if (money >500){
            System.out.println("买雪铁龙DS9");
        }
        else if (money >= 100 ){
            System.out.println("买雪铁龙C6");
        }
        else if (money >=50){
            System.out.println("买雪铁龙C5");
        }
        else if (money >=10){
            System.out.println("买雪铁龙爱丽舍");
        }
        else {
            System.out.println("买捷安特");
        }
    }
}
