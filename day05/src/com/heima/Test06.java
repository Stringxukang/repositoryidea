package com.heima;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        boolean i =panDuan(year);
        System.out.println(i);
    }
    public static boolean panDuan(int year){
        if (year % 400 == 0 || year % 4 == 0 && year%100!=0){
            return true;
        }else {
            return false;
        }
    }
}
