package com.itheima;

public class Score {
    public static void main(String[] args) {
        int score1 = 99;
        int score2 = 77;

        System.out.println(score1 > 90 && score2 > 90 );
        System.out.println(score1 > 90 ||score2 > 90 );
/*满足如下两个条件之一，那么年份就是闰年
1、年份可以被400整除
2、年份可以被4整除，但是不能被100整除
 */
        int year = 2014;
        boolean b1 = (year % 400 == 0) |  (year % 4 ==0 && year % 100 != 0);
        System.out.println(b1);
    }

}
