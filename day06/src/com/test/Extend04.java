package com.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/* 4，有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数字。要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：
请输入一个整数数字：
50
生成的新数组是：12 14 23 45 50 66 68 70 77 90 */
public class Extend04 {
    public static void main(String[] args) {
        int[] arr ={12,14,23,45,66,68,70,77,90,91};
        int[] arr1 ={12,14,78,45,66,68,70,77,90,91};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        getArray(arr);
    }
    public static void getArray(int[] arr){
        int[] arr1=new int[arr.length+1];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<number){
                arr1[i]=arr[i];
            }else if (number<arr[i]){//13<14  i=1  13<23 i =2
                if (number>arr[i-1])  {//13>12
                    arr1[i]=number;//arr1[1]=13
                    arr1[i+1]=arr[i];
                } else {
                arr1[i+1]=arr[i];}  //arr1[3]=arr[2]  i=2
            }
        }
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);
        }

    }
}
