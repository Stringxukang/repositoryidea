package com.itheima;

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {

       isEvenNumber(55);
       //变量的调用
        int number = 55;
        isEvenNumber(number);
 //       getMax();
    }
//不带参数的方法调用
    /*public static void isEvenNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println(number + "是偶数");
        }
        else {
            System.out.println(number + "是奇数");
        }*/

    //带参数的方法调用
    public static void isEvenNumber(int number){
        if (number % 2 == 0){
            System.out.println(number + "是偶数");
        }
        else {
            System.out.println(number + "是奇数");
        }

    }


 /*
    public static void getMax() {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println(max);
    }
    */
}

