package com.itheima;

public class Day02Test03 {
    public static void main(String[] args) {
        int i = 123;
        System.out.println("个位数是：" + (i%10));
        System.out.println("十位数是：" + (i/10%10));
        System.out.println("百位数是：" + (i/100%10));
    }
}
