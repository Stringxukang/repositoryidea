package com.itheima;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        int ans = -1;
        while (ans!=1){
            System.out.println("你爱我吗？（1/0）");
            Scanner sc = new Scanner(System.in);
            System.out.print("1爱我/0不爱：");
            ans = sc.nextInt();
        }
        System.out.println("我也爱你");
    }
}
