package com.itheima;
/*
 *  分析以下需求，并用代码实现：
	1.键盘录入学生成绩(整数类型),如果录入的成绩为-1表示录入结束
	2.打印输出录入的学生成绩的平均值
	 */

import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;//记录学生的个数
        int sum = 0;//记录学生的总成绩
        while (true) {
            System.out.println("输入-1位录入结束");
            System.out.println("请输入学生的成绩：");

            int score = sc.nextInt();
            if (score == -1) {
                break;
            }
            count++;
            sum += score;

        }
        double mean = sum / count;

        System.out.println("平均成绩为：" + mean);

    }
}
