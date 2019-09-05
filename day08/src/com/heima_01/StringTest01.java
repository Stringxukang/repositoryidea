package com.heima_01;
//键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line = sc.nextLine();
        int countA = 0;
        int counta = 0;
        int count1 = 0;
        for (int i = 0; i <line.length() ; i++) {
            int ch=line.charAt(i);
            if (ch>='A'&&ch<='Z'){
                countA++;
            }else if (ch>='a'&&ch<='z'){
                counta++;
            }else {
                count1++;
            }
        }

        System.out.println("大写字母字符出现的次数为；"+ countA);
        System.out.println("小写字母字符出现的次数为；"+ counta);
        System.out.println("数字字符出现的次数为；"+ count1);
    }
}
