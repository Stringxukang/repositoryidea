package com.itheima;
import java.util.Scanner;
public class Day02Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方形的长：");
        int l = sc.nextInt();
        System.out.println("请输入长方形的宽：");
        int k = sc.nextInt();
        int area = l * k;
        int perimeter =2*(l + k);
        System.out.println("长方形的面积：" + area);
        System.out.println("长方形的周长：" + perimeter);
    }
}
