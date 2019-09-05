package com.heima;

import java.util.Random;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个100-999的数：");
        int number =sc.nextInt();
        panDuan(number);
    }
    public static void panDuan(int number){
            int ge =number%10;
            int shi =number/10%10;
            int bai =number/100%10;
            if (number>=100&&number<1000){
        if (number==Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3)){
            System.out.println(number+"是水仙花数");
        }else {
            System.out.println(number+"不是水仙花数");
        }
    }else {
                System.out.println("您输入的有误");
            }
    }
}
