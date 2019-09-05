package com.itheima;

//4行5列   外层控制行数，内层控制列数
public class Test12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int j = 1;
            while (j <= 5) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }
}
