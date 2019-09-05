package com.itheima;
/*
 * 	02,从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和:
  		1.数字的个位数不为7;
  		2.数字的十位数不为5;
  		3.数字的百位数不为3;
 */
import java.util.Scanner;

public class homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 100; i <= number; i++) {
            if (i % 10 != 7 && i / 10 % 10 != 5 && i / 10 / 10 % 10 != 3) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
