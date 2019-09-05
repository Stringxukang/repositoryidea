package com.itheima;
import java.util.Scanner;
public class Day02Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份，范围（1-12）,且为整数:");
        int month = sc.nextInt();

        if (month==3 ||month== 4||month==5){
            System.out.println("春季");
        }
        else if (month == 6 || month == 8 || month ==7){
            System.out.println("夏季");
        }
        else if (month==9 || month ==10 || month ==11){
            System.out.println("秋季");
        }
        else {
            System.out.println("冬季季");
        }
    }
}
