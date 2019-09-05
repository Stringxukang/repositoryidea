package com.test;

import java.util.Scanner;

public class Test_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s1 = sc.nextLine();
        char[] arr = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
                arr[i] = s1.charAt(i);
        }
        if (arr[0] != arr[arr.length - 1]) {
            char temp = 0;
            temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
        for (int i = 0; i <arr.length ; i++) {
            if (i%2==0){
                arr[i]='~';
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>='A'&&arr[i]<='Z'){
                arr[i] = (char) (arr[i]+32);
            }
            System.out.println(arr[i]);
        }

    }
}
;