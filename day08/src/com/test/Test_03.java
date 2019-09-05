package com.test;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Test_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String i = sc.nextLine();
        //第一种
        StringBuilder s = new StringBuilder(i);
        String s1 = s.reverse().toString();
        System.out.println(s1);
        //第二种
        char[] arr = new char[i.length()];
        for (int j = 0; j < i.length(); j++) {
            arr[j] = i.charAt(j);
        }
        char temp = '0';
        for (int j = 0, k = arr.length - 1; j < k; j++, k--) {
            temp =arr[j];
            arr[j]=arr[k];
            arr[k]=temp;
        }
        String s2= Arrays.toString(arr);
        System.out.println(valueOf(arr));
        for (int j = 0; j <s2.length() ; j++) {
            System.out.print(s2.charAt(j));
        }

    }


}
