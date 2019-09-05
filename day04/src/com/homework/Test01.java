package com.homework;

import java.util.Random;

/*
 * 定义一个长度为3的一维数组,给每个元素赋值.
 * (要求数组中每个元素的值是0-9的随机数)
 * 遍历数组打印每个元素的值
 *
 */
public class Test01 {
    public static void main(String[] args) {


        int[] arr = new int[3];

        for (int i = 0; i <arr.length ; i++) {
            Random r = new Random();
            int number = r.nextInt(10);
            arr[i]=number;
            System.out.println(arr[i]);
        }
    }
}
