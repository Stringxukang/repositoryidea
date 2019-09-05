package com.heima_01;

import java.util.Scanner;

//定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
//例如，键盘录入abc，输出结果 cba
public class StringBuilderDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
   //     StringBuilder s1 = reversetoString(s);
  //      String s2 =s1.toString();
        String s2 = reversetoString(s);
        System.out.println("s2:"+s2);
    }
    //2个明确
//    返回值类型：String
//    参数 String
  //  public static StringBuilder reversetoString(String s){
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        return sb;
        public static String reversetoString(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
