package com.test;

import java.util.Scanner;

/* 1，某商场购物可以打折，具体规则如下：
	普通顾客购不满100元不打折，满100元打9折；
	会员购物不满200元打8折，满200元打7.5折；
	不同打折规则不累加计算。
请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。 */
public class Extend01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入购物金额：");
        double money = sc.nextDouble();
        double money1 =0;
        while (true){
            System.out.println("您是否是会员（1-会员 0-普通顾客）：");
            int i = sc.nextInt();
            if (i==0||i==1) {
                switch (i) {
                    case 1:
                        if (money < 200) {
                            money1 = 0.8 * money;
                        } else {
                            money1 = 0.75 * money;
                        }
                        break;
                    case 0:
                        if (money > 100) {
                            money1 = money * 0.9;
                        } else {
                            money1 = money;
                        }
                        break;
                }
                break;
            }else {
                System.out.println("您输入的有误，请重新输入");
            }
        }
        System.out.println("购物的折前金额:"+money+",应付金额"+money1);
    }
}
