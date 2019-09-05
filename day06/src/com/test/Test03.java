package com.test;

import java.util.Scanner;

/*3，让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。*/
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int number1 = sc.nextInt();
        System.out.println("请输入第一个整数：");
        int number2 = sc.nextInt();
        System.out.println("请输入第一个整数：");
        int number3 = sc.nextInt();
        int min =getMin(number1,number2,number3);
        System.out.println("最小值："+min);
    }
    public static int getMin(int a,int b,int c){
       int min1 = a>b?b:a;
       int min =min1>c?c:min1;
        return min;
    }
}
