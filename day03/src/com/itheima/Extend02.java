package com.itheima;

import java.util.Scanner;

/*
	循环录入学员Java课程的成绩（学员数量由键盘录入），统计分数大于等于80分的学生的比例。
	分析：
		1.创建键盘录入对象
		2.定义int类型的变量score(学员成绩)、total(学员数量)、count(>=80分的学员数量)
		3.通过键盘录入操作给total变量赋值
		4.利用for循环(循环次数为total)，循环录入学员成绩
			(1)获取当前键盘录入的成绩
			(2)判断该成绩如果<80,continue继续进行下次录入
			(3)否则如果改成绩>=80,count++
		5.定义double类型的rate，并计算80分以上的比例，赋值给rate
		6.打印最终的 计算结果
 */
public class Extend02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学员的数量：");
        int total = sc.nextInt();//获取学员总数
        int count = 0;
        for (int i = 1; i <= total; i++) {
            System.out.println("请输入学员的成绩：");
            int score = sc.nextInt();//获取当前键盘录入的成绩
            if (score < 80) {
                continue;
            } else {
                count++;//统计超过80的人数
            }

        }
        double rate = (double) count / total;//定义double类型的rate，并计算80分以上的比例，赋值给rate
        System.out.println(rate);
    }
}
