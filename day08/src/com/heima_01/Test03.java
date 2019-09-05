package com.heima_01;

import java.util.Scanner;

//定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        System.out.println(reveString(s));
    }

    //2个明确
//    返回值类型：String
//    参数：int[] arr
    public static String reveString(String s) {
        String ss = "";
        ////在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串并返回
        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        return ss;
    }
}

