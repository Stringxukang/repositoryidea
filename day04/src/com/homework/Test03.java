package com.homework;

import java.util.Random;
import java.util.Scanner;

/*
 * 键盘录入一个整数，创建一个该长度的数组，为每一个元素赋值为1-10的随机整数，最后打印数组中所有值大于5且为偶数的元素.
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int i = sc.nextInt();
        int[] arr = new int[i];
        for (int j = 0; j <i ; j++) {
            Random r = new Random();
            int number = r.nextInt(10) - 1;
            arr[j] = number;
            if (arr[j] > 5 && arr[j] % 2 == 0) {

                System.out.println(arr[j]);
            }
        }
    }
}
