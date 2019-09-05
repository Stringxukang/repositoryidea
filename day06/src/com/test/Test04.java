package com.test;

import java.util.Scanner;

/*4,
某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
	存期		年利率（%）
	一年		2.25
	两年		2.7
	三年		3.25
	五年		3.6
请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
提示：
	存入金额和存入年限均由键盘录入
	本息计算方式：本金+本金×年利率×年限
*/
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您需要存入的金额：");
        int money =sc.nextInt();
        System.out.println("请输入您需要存入的年限：");
        int year =sc.nextInt();
        double money1 =moneyInterest(money,year);
        System.out.println("您到期后得到的本息总额："+money1);
    }
    public static double moneyInterest(int money,int year){
        double sumMoney = 0;
        if (money>=1000) {
            switch (year) {
                case 1:
                    sumMoney = money + money * 0.0225 * year;
                    break;
                case 2:
                    sumMoney = money + money * 0.027 * year;
                    break;
                case 3:
                    sumMoney = money + money * 0.0325 * year;
                    break;
                case 5:
                    sumMoney = money + money * 0.036 * year;
                    break;
                default:
                    System.out.println("您输入的年限有误");
            }
        }else {
            System.out.println("low逼就不要来存钱了");
        }
        return sumMoney;
    }
}
