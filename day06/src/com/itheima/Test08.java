package com.itheima;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int index = getIndex(arr, number);
        System.out.println("index:"+index);
    }
//        int[] arr ={11,22,33,44,55};
//        int index =-1;
//        System.out.println("请输入一个数字：");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        for (int x =0 ;x<arr.length;x++){
//            if (arr[x]==number) {
//                index = x;
//                break;
//
//            }
//        }
//        System.out.println(index);
        /*定义一个方法
        两个明确：
            返回值类型：int
            参数：int[] arr int number
        * */

    public static int getIndex(int[] arr, int number) {
        int index = -1;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == number) {
                index = x;
                break;
            }
        }
        return index;
    }
}