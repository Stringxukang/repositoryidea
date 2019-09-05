package com.test;
/*2，某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？*/

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        int peanut =8;
        int rice =3;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        int yu =sc.nextInt();
        switch (yu) {
            case 16:
                sum = (yu + peanut + rice)*1.0;
            case 24:
                sum = yu + peanut + rice;
                if (sum > 30) {
                    sum = sum * 0.8;
                }
        }
        System.out.println("最少要花:"+sum);
        }
    }

